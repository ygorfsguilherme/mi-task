import { useState } from "react";
import { BrowserRouter as Router, Routes, Route, useLocation } from "react-router-dom";
import Navbar from './components/Navbar';
import { searchData } from "./interface/searchData";
import Add from './pages/Add';
import Home from './pages/Home';
import Task from "./pages/Task";

export default function AppRouter() {
  const [data, setData] = useState<searchData>()

  return (
    <Router>

      <Routes>
        <Route path={"/user/*"} element={<Navbar data={data} setData={setData}/>} />
      </Routes>

      <Routes>
        <Route path={"/user/home"} element={<Home data={data} setData={setData}/>} />
        <Route path="/user/add" element={<Add />} />
        <Route path="/user/task/*" element={<Task />} />
      </Routes>

      <Routes>   
        <Route path="/login" element={<Home data={data} setData={setData}/>} />
      </Routes>
    </Router>
  );
}
