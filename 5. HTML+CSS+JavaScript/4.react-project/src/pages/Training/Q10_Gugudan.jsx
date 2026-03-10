import useGugudan from "../../store/Q10_useGugudan";

function Gugudan(){
    const {msg1, msg2, number1, number2, number3, mult, ischan, clearmsg} = useGugudan();

    return(
        <>
            <div>
                <label htmlFor="number1">첫번째 수(a): </label>
                <input type="number" id="number1" onChange={(e) => number1(e.target.value)}/>
            </div>
            <div>
                <label htmlFor="number2">두번째 수(b): </label>
                <input type="number" id="number2" onChange={(e) => number2(e.target.value)}/>
            </div>
            <p>
                {/* 문제 axb=? 형식으로 보여야 함 */}
                문제:{msg1} X {msg2} = ?
            </p>
            <input type="number" onChange={number3(e.target.value)}/>
            <button onClick={mult}>정답 확인</button>
            <button style={{marginTop:'10px'}} onClick={clearmsg}>초기화</button>
            {/* 
                사용자가 입력한 숫자가 정답일 경우 '정답 입니다!' 출력
                정답이 아닐 경우 '오답 입니다!' 출력
            */}
            <p style={{marginTop: '10px'}}>{ischan ? '정답 입니다!' : '오답 입니다!'}</p>
        </>
    )
}

export default Gugudan;