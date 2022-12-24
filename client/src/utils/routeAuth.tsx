import Login from "../pages/Login";
import { BrowserRouter as Router, Routes, Route} from "react-router-dom";
import Register from "../pages/Register";

export default function RouteAuth(muda: any) {

  return (
    <>
      <Routes>   
        <Route path="/*" element={<Login />} />
        <Route path="/register" element={<Register />} />
      </Routes>
    </>

  )
}
