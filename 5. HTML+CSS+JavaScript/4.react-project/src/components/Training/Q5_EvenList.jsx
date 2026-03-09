

function EvenList({numbers}){
    return(
        <>
            {numbers.filter(number => number%2 === 0)
                    .map((number, index)=>{
                        return <p key={index}>{number}</p>
                    })
            }
        </>
    )
}

export default EvenList;