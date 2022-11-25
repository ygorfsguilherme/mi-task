import React, { useEffect, useState } from 'react'
import Button from '../../components/ButtonCicle'
import styled from './Add.module.scss'
import Check from '../../assets/icon/check.svg'
import axios from 'axios'
import { typeData } from '../../interface/typeData'
import { useNavigate } from 'react-router-dom'

export default function Add() {
  const navigate = useNavigate()

  const [data, setData] = useState<typeData>({
    title: '',
    time: new Date(),
    content: '',
  })

  function enviar(e: any){
    e.preventDefault()
    
    setData({...data, time: new Date()})

    axios.post("http://localhost:3000/task",{
      title: data.title,
      time: data.time,
      content: data.content,
    })
    .then(response => {
      if(response.status == 201){
        navigate("/user/home")
      }
    })
  }

  return (
    <form onSubmit={enviar} className={styled.add}>
        <h3>Titulo</h3>
        <input type="text" value={data.title} onChange={e => {setData({...data, title: e.target.value})}} />
        <textarea value={data.content} onChange={e => {setData({...data, content: e.target.value})}} ></textarea>

        <Button color='green' icon={Check} />
    </form>
  )
}
