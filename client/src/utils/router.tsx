import { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";
import RouteAuth from "./routeAuth";
import RouteUser from "./routeUser";

export default function AppRouter() {
  const [tokenStatus, setTokenStatus] = useState(false)
  const location = useLocation().pathname

  useEffect(()=>{
    const token = localStorage.getItem('mitask-token')
    if(token){
      setTokenStatus(true)
    } else {
      setTokenStatus(false)
    }
    
  }, [location])

  if(tokenStatus){
    return <RouteUser/>
  }
  return <RouteAuth />
}
