import { useState } from "react";


function MultipleState(){
    const[name, setName] = useState('홍길동');
    const[age, setAge] = useState(19);
    const[isClick, setIsClick] = useState(false);

    function updateName(){
        setName('김철수');
    }

    return(
        <>
            <p>이름 : {name}</p>
            <p>나이 : {age}</p>
            <button onClick={updateName}>이름 변경</button>
            <button onClick={() => setAge(20)}>나이 변경</button>
            <button onClick={() => setIsClick(!isClick)}>
                {isClick ? '메시지 숨기기' : '메시지 보기'}
            </button>
        </>
    )
}

export default MultipleState;