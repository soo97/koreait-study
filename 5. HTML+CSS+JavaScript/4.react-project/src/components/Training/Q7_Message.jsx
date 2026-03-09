


function Message(){
    let isFlase = false;
    let Message = "안녕하세요";

    function handleclick(){
        if(isFlase){
            Message = "안녕하세요.";
        }else{
            Message = "반갑습니다.";
        }
        isFlase = !isFlase;
    }

    return(
        <>
            <p>{Message}</p>
            <button onClick={handleclick}>클릭</button>
        </>
    )
}

export default Message;