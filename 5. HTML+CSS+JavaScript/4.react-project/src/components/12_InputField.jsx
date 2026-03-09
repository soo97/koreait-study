import { useState } from "react";

function InputField(){
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');

    function handleName(e){ // e = event
        console.log(e);
        setName(e.target.value);
        console.log(name);
    }

    function handleEmail(e){
        console.log(e);
        setEmail(e.target.value);
        console.log(email);
    }
// onChage : input 태그를 기반으로 하는
// onblur : focusing 해제 되었을때
    return(
        <form action="">
            <input type="text" onChange={handleName}/>
            <input type="text" onChange={handleEmail}/>
        </form>
    )
}

export default InputField;