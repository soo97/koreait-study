import { useNavigate } from "react-router-dom"
import { loginMemberApi } from "../api/memberApi";
import { useMutation } from "@tanstack/react-query";

export const useLoginMemberMutation = () => {
    const navigate = useNavigate();

    return useMutation({
            mutationFn: loginMemberApi,
            onSuccess: (data) => { // 성공 시 실행
                alert("로그인 되었습니다.");
                navigate('/'); 
            },
            onError: (error) => { // 실패 시 실행
                alert("로그인 요청 중 오류가 발생했습니다.");
            }
            
        })
}