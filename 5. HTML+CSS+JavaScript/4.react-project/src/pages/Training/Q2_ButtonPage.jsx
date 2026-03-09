import Button from "../../components/Training/Q2_Button";


function ButtonPage(){
    function btnclick(){
        alert("클릭되었습니다.")
    }
    
    return(
        <>
            <Button onClick={btnclick}/>
        </>
    )
}

export default ButtonPage;