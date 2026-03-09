

function LoginStatus({isLogin}){
    return(
        <>
            {isLogin === true && "로그인 성공"}
            {isLogin !== true && "로그인 필요"}
        </>
    )
}

export default LoginStatus;