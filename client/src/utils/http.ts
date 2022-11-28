import axios from "axios"
import { typeData } from "../interface/ITypeData"

const url = "http://localhost:3000/task"

export const HttpGetAll = async (setData: React.Dispatch<React.SetStateAction<never[]>>) => {
    axios.get(url)
        .then(response => setData(response.data))
}

export const HttpGetTitle = async (data: any, setData: React.Dispatch<React.SetStateAction<never[]>>) => {
    axios.get(`${url}?title=${data}`)
        .then(response => response.status == 200 ? setData(response.data) : '')
}

export const HttpGetId = async (id: string, setData: React.Dispatch<React.SetStateAction<typeData>>) => {
    axios.get(`${url}/${id}`)
        .then(response => response.status == 200 ? setData(response.data) : '')
}

export const HttpPost = async (values: any, navigate: any) => { 
    axios.post(url, values)
        .then(response => response.status == 201 ? navigate("/user/home") : '')
}

export const HttpPut = async (id: string, data: typeData) => {
    axios.put(`${url}/${id}`, {
        id: data.id,
        title: data.title,
        time: data.time,
        content: data.content,
    })
}

export const HttpDelete = async (id: string, navigate: any) => {
    axios.delete(url + `/${id}`)
        .then(response => response.status == 200 ? navigate("/user/home") : '')
}