import axiosInstance from "./axiosInstance"

// 공지사항 목록 조회
export const noticeListApi = async (page = 1) => {
    const response = await axiosInstance.get("/api/board/notice", {
        params: {
            page: page,
        },
        withCredentials: true
    })
    return response.data;
}

// 공지사항 상세보기 조회
export const noticeDetailApi = async (postId) => {
    try {
        const response = await axiosInstance.get(`/api/board/notice/${postId}`, {
            withCredentials: true
        })
        return response.data;
    } catch (err) {

        // 서버가 응답을 했는데 상태코드가 4xx, 5xx
        if (err.response) {
            console.error('응답 데이터 : ', err.response.data);
            throw err;
        } else if (err.request) {
            // 요청은 보냈는데 서버가 응답을 하지 않았을 때
            console.error('서버에 연결할 수 없습니다.');
            throw err;
        } else {
            //요청 중 에러 발생했을 때
            console.error('요청 중 에러 발생 : ', err.message);
            throw err;
        }
    }
}

// 공지사항 글쓰기
export const createApi = async (formData) => {
    const response = await axiosInstance.post("/api/board/notice",
        formData, {
        withCredentials: true,
        header: {
            'Content-Type': 'multipart/form-data'
        }
    })
    return response.data;
}

// 공지사항 수정 페이지 이동 조회
export const noticeGoEditPageApi = async (id) => {
    try {
        const response = await axiosInstance.get(`/api/board/notice/${id}`, {
            withCredentials: true, // 세션 쿠키를 포함하기 위해 필요
        });
        console.log('[API] 공지사항 수정용 데이터 조회 성공:', response.data);
        // 백엔드가 boardDTO로 감싸서 반환
        return response.data.boardDTO || response.data;
    } catch (error) {
        console.error('[API] 공지사항 수정용 데이터 조회 실패:', error);
        if (error.response) {
            // 서버가 응답했지만 에러 상태 코드
            console.error('응답 데이터:', error.response.data);
            console.error('상태 코드:', error.response.status);
            throw error;
        } else if (error.request) {
            // 요청은 보냈지만 응답을 받지 못함
            console.error('서버에 연결할 수 없습니다. 서버가 실행 중인지 확인해주세요.');
            throw new Error('서버에 연결할 수 없습니다. 서버가 실행 중인지 확인해주세요.');
        } else {
            // 요청 설정 중 에러 발생
            console.error('요청 설정 오류:', error.message);
            throw error;
        }
    }
};

// 공지사항 수정 요청
export const noticeEditApi = async (id, formData) => {
    try {
        console.log(`[API] 공지사항 수정 요청: id=${id}`, formData);
        const response = await axiosInstance.patch(`/api/board/notice/${id}`, formData, {
            withCredentials: true, // 세션 쿠키를 포함하기 위해 필요
            headers: {
                'Content-Type': 'multipart/form-data', // 파일 업로드를 위해 필요
            },
        });
        console.log('[API] 공지사항 수정 성공:', response.data);
        return response.data;
    } catch (error) {
        console.error('[API] 공지사항 수정 실패:', error);
        if (error.response) {
            // 서버가 응답했지만 에러 상태 코드
            console.error('응답 데이터:', error.response.data);
            console.error('상태 코드:', error.response.status);
            throw error;
        } else if (error.request) {
            // 요청은 보냈지만 응답을 받지 못함
            console.error('서버에 연결할 수 없습니다. 서버가 실행 중인지 확인해주세요.');
            throw new Error('서버에 연결할 수 없습니다. 서버가 실행 중인지 확인해주세요.');
        } else {
            // 요청 설정 중 에러 발생
            console.error('요청 설정 오류:', error.message);
            throw error;
        }
    }
};

export const noticeEditContentApi = async (e) => {
    e.preventDefault();

    // 유효성 검사
    if (!title.trim()) {
        alert('제목을 입력해주세요.');
        return;
    }

    if (!quillRef.current) {
        alert('에디터가 준비되지 않았습니다.');
        return;
    }

    // 에디터에서 내용 가져오기
    const content = quillRef.current.root.innerHTML;

    if (!content.trim() || content === '<p><br></p>') {
        alert('내용을 입력해주세요.');
        return;
    }

    setIsSubmitting(true);

    try {
        // FormData 생성 (파일 업로드를 위해)
        const formData = new FormData();

        // BoardDTO.EditRequest 필드 추가
        formData.append('title', title);
        formData.append('content', content);
        formData.append('category', category);

        // 파일 추가 (여러 파일 가능)
        selectedFiles.forEach((file) => {
            formData.append('files', file);
        });

        console.log('[NoticeEdit] 수정 요청 데이터:', {
            id: postId,
            title,
            content,
            category,
            filesCount: selectedFiles.length
        });

        // API 호출
        await noticeEditApi(postId, formData);

        // 디테일 페이지 쿼리 캐시 무효화하여 최신 데이터를 다시 조회하도록 함
        queryClient.invalidateQueries({ queryKey: ['noticeDetail', postId] });

        alert('공지사항이 수정되었습니다.');
        navigate(`/notice/detail/${postId}`);
    } catch (error) {
        console.error('[NoticeEdit] 수정 실패:', error);

        if (error.response) {
            // 서버 응답 에러
            const errorMessage = error.response.data?.message ||
                error.response.data?.error ||
                '게시글 수정 중 오류가 발생했습니다.';
            alert(errorMessage);

            // 인증 오류인 경우 로그인 페이지로 리다이렉트
            if (error.response.status === 401 || error.response.status === 403) {
                navigate('/login');
            }
        } else if (error.request) {
            alert('서버에 연결할 수 없습니다. 서버가 실행 중인지 확인해주세요.');
        } else {
            alert('요청 처리 중 오류가 발생했습니다: ' + error.message);
        }
    } finally {
        setIsSubmitting(false);
    }
};



// 공지사항 삭제
export const noticeDeleteApi = async (postId) => {
    const response = await axiosInstance.delete(`/api/board/notice/${postId}`, {
        method: 'delete',
        withCredentials: true
    })
    return response.data;
}

