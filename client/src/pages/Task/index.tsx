import { useLocation, useNavigate } from 'react-router-dom'
import Button from '../../components/ButtonCicle'
import axios from "axios"
import { useEffect, useState } from 'react'
import styled from './Task.module.scss'
import DeleteIcon from '../../assets/icon/delete.svg'
import { typeData } from '../../interface/typeData'

export default function Task() {
  const navigate = useNavigate()

  const [data, setData] = useState<typeData>({})
  
  const location = useLocation()
  const id = location.pathname.substring(100, 11)

  useEffect(()=>{
    axios.get(`http://localhost:3000/task/${id}`)
      .then(response => setData(response.data))
  }, [])

  function Delete(e: any){
    e.preventDefault()

    axios.delete(`http://localhost:3000/task/${id}`)
    .then(response => {
      if(response.status == 200){
        navigate("/user/home")
      }
    })
  }

  return (
    <form onSubmit={Delete} className={styled.add}>
      <section className={styled.card} id={data.id}>
          <span></span>

          <article>
            <h2>{data.title}</h2>
            <time>{data.time}</time>

            <p>{data.content}</p>
          </article>
      </section>

      <Button color='red' icon={DeleteIcon} />
    </form >
  )
}
