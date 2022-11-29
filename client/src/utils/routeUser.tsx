import { useState } from "react";
import Navbar from '../components/Navbar';
import { searchData } from "../interface/ISearchData";
import Add from '../pages/Add';
import Home from '../pages/Home';
import Task from "../pages/Task";
import { BrowserRouter as Router, Routes, Route} from "react-router-dom";

export default function RouteUser() {
  const [data, setData] = useState<searchData>()

  return (
    <>
      <Routes>
        <Route path="*" element={<Navbar data={data} setData={setData}/>} />
      </Routes>

      <Routes>
        <Route path={"/"} element={<Home data={data} setData={setData}/>} />
        <Route path={"/home"} element={<Home data={data} setData={setData}/>} />
        <Route path="/user/add" element={<Add />} />
        <Route path="/user/task/*" element={<Task />} />
      </Routes>
    </>
  )
}
