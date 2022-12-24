import axios from "axios"
import { typeData } from "../interface/ITypeData"
const url_base = "http://localhost:8080/"

const token = localStorage.getItem("mitask-token")

const headers = { 
        'Content-Type': 'application/json', 
        'Authorization': `Bearer ${token}`
}

function Logout(){
  localStorage.removeItem("mitask-token")
}

export const HttpGetAll = async (setData: React.Dispatch<React.SetStateAction<never[]>>) => {
    var config = {
        method: 'get',
        url: `${url_base}taskall`,
        headers: { 
          'Content-Type': 'application/json', 
          'Authorization': `Bearer ${token}`
      }
    };
      
    axios(config)
    .then(response => {
        if(response.status == 200){
            setData(response.data)
        }
    }).catch(error => console.log("lo"));
}

export const HttpGetTitle = async (data: any, setData: React.Dispatch<React.SetStateAction<never[]>>) => {

      var config = {
          method: 'get',
          url: `${url_base}task?title=${data}`,
          headers: headers
      };
        
      axios(config)
      .then(response => {
          if(response.status == 200){
              setData(response.data)
          }
      }).catch(error => localStorage.removeItem("mitask-token"));
}

export const HttpGetId = async (id: string, setData: React.Dispatch<React.SetStateAction<typeData>>) => {
    var config = {
        method: 'get',
        url: `${url_base}task/${id}`,
        headers: headers
    };
      
    axios(config)
    .then(response => response.status == 200 ? setData(response.data) : '')
    .catch(error => Logout());
}

export const HttpPost = async (values: any, navigate: any) => {
    const data = JSON.stringify({
      "title": values.title,
      "contents": values.contents
    });

    var config = {
      method: 'post',
      url: `${url_base}task`,
      headers: headers,
      data : data
    };
    
    axios(config)
    .then(response => response.status == 201 ? navigate("/home") : '')
    .catch(error => {
      Logout()
      navigate("/")
    });
}

export const HttpPut = async (id: string, values: typeData) => {

  const data = JSON.stringify({
      "title": values.title,
      "contents": values.contents
    });

    var config = {
      method: 'put',
      url: `${url_base}task/${id}`,
      headers: headers,
      data : data
    };
    
    axios(config)
    .then(response => response.status == 200 ? console.log("Update task") : '')
    .catch(error => Logout());
}

export const HttpDelete = async (id: string, navigate: any) => {

    var config = {
        method: 'delete',
        url: `${url_base}task/${id}`,
        headers: headers
      };
      
    axios(config)
    .then(response => response.status == 200 ? navigate("/home") : '')
    .catch(error => Logout());
}

export const HttpLogin = async (values: any) => {
  const data = JSON.stringify({
    "email": values.email,
    "password": values.password
  });

  var config = {
    method: 'post',
    url: `${url_base}auth`,
    headers: {
      'Content-Type': 'application/json',
    },
    data : data
  };
  
  axios(config)
  .then(result => { 
    if(result.status == 200){
      localStorage.setItem('mitask-token', result.data.token)
    }
  })
  .catch(error => console.log('error', error));
}