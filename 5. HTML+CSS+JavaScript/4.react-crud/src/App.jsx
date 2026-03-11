import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home.jsx'
import Register from './pages/register.jsx';
import Login from './pages/Login.jsx';

function App() {

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/register" element={<Register/>} />
        <Route path="/Login" element={<Login/>} />
      </Routes>
    </Router>
  )
}

export default App
