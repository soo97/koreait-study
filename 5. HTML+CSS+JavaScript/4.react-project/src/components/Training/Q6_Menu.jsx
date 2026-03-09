

function Menu({hnavs}){
    return(
        <>
            <ul>
                {hnavs.map((hnav, index)=>{
                    return <li key={index}>{hnav}</li>
                })
                }
            </ul>
        </>
    )
}

export default Menu;