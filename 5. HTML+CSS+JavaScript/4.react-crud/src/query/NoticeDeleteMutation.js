import { useMutation } from "@tanstack/react-query"

export const useNoticeDeleteMutation = () => {

    return useMutation({
                mutationFn: boardApi,
                onSuccess: (data) => { // 성공 시 실행
                    alert("삭제되었습니다.");
                    navigate('/'); 
                },
                onError: (error) => { // 실패 시 실행
                    alert("삭제가 취소 되었습니다.");
                }
                
            })
}