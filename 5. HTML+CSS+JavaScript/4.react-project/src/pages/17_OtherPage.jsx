import useVisitCountStore from "../store/17_VisitCountStore";
import { Link } from "react-router-dom";

function OtherPage(){
    const {visitCount} = useVisitCountStore();

    return(
        <>
            <h2>다른 페이지</h2>
            <p>현재 visit 페이지에 방문한 횟수는 <strong>{visitCount}</strong>번 입니다.</p>
            <Link to="/17_Other">방문 페이지로 이동하기</Link>
            {/* Link = a태그 대신 쓰이는 애 */}
        </>
    )
}

export default OtherPage;

// useState - 단일
// Zustand- 여러개의 컴포넌트가 같이 사용해야 할때