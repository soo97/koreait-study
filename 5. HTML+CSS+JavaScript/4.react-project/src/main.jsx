import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
// ------추가 ----
import NewVariable from './components/01_NewVariable.jsx'
import RouterTest from './pages/02_RouterTest.jsx'
import Query from './pages/03_Query.jsx'
import Path from './pages/04_Path.jsx'
import Extension from './pages/05_Extension.jsx'
import Props from './pages/06_Props.jsx'
import Rendering from './pages/07_Rendering.jsx'
import ListRendering from './pages/08_ListRendering.jsx'
import EventHandler from './pages/09_EventHandler.jsx'
import ProfilePage from './pages/Training/Q1_ProfilePage.jsx'
import ButtonPage from './pages/Training/Q2_ButtonPage.jsx'
import LoginPage from './pages/Training/Q3_LoginPage.jsx'
import FruitPage from './pages/Training/Q4_FruitPage.jsx'
import EvenPage from './pages/Training/Q5_EvenPage.jsx'
import MenuPage from './pages/Training/Q6_MenuPage.jsx'
import MessagePage from './pages/Training/Q7_MessagePage.jsx'
import Status from './pages/10_Status.jsx'
import UseState from './pages/11_UseState.jsx'
import FormHandling from './pages/12_FormHandling.jsx'
import Lifting from './pages/13_Lifting.jsx'

import{
  createBrowserRouter, RouterProvider
}from "react-router-dom"

const router = createBrowserRouter([
  {
    path: "/01", //URL
    element: <NewVariable/> //해당 URL로 요청이 왔을때 보여줄 (랜더링 할) 함수
  },
  {
    path: "/02",
    element: <RouterTest/>
  },
  {
    path: "/03",
    element: <Query/>
  },
  {
    path: "/04/:value",
    element: <Path/>
  },
  {
    path: "/05",
    element: <Extension/>
  },
  {
    path: "/06",
    element: <Props/>
  },
  {
    path: "/07",
    element: <Rendering/>
  },
  {
    path: "/08",
    element: <ListRendering/>
  },
  {
    path: "/09",
    element: <EventHandler/>
  },
  {
    path: "/Q1",
    element: <ProfilePage/>
  },
  {
    path: "/Q2",
    element: <ButtonPage/>
  },
  {
    path: "/Q3",
    element: <LoginPage/>
  },
  {
    path: "/Q4",
    element: <FruitPage/>
  },
  {
    path: "/Q5",
    element: <EvenPage/>
  },
  {
    path: "/Q6",
    element: <MenuPage/>
  },
  {
    path: "/Q7",
    element: <MessagePage/>
  },
  {
    path: "/10",
    element: <Status/>
  },
  {
    path:"/11",
    element: <UseState/>
  },
  {
    path: "/12",
    element: <FormHandling/>
  },
  {
    path: "/13",
    element: <Lifting/>
  }
])
// ---------------

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App /> - 제거 */}
    <RouterProvider router={router}/> {/*추가 */}
  </StrictMode>,
)
