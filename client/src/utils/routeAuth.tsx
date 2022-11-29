import Login from "../pages/Login";
import { BrowserRouter as Router, Routes, Route, useLocation } from "react-router-dom";
import Register from "../pages/Register";

export default function RouteAuth(muda: any) {
  const location = useLocation()
  console.log(location.pathname)

  return (
    <>
      <Routes>   
        <Route path="/" element={<Login />} />
        <Route path="/register" element={<Register />} />
      </Routes>

      <Routes>   
        <Route path="/*" element={<Login />} />
      </Routes>
    </>

  )
}
