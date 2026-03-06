function PrintWorld(){ // 추가
    return(
        <p>Hello World!</p>
    )
}

function NewVariable() {

    return (
    <section>  // 추가
        <h1>hi</h1>
        <h2>hello</h2>
        <PrintWorld/>
        </section>
    )
}

export default NewVariable //수정
