import { useLocation, useNavigate } from 'react-router-dom'
import Button from '../../components/ButtonCicle'
import axios from "axios"
import { useEffect, useState } from 'react'
import styled from './Task.module.scss'
import DeleteIcon from '../../assets/icon/delete.svg'
import SaveIcon from '../../assets/icon/save.svg'
import { typeData } from '../../interface/ITypeData'
import '../../assets/styles/containerButtons.scss'
import Modal from '../../components/Modal'
import classNames from 'classnames'

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

  function Update(e: any){
    axios.put(`http://localhost:3000/task/${id}`, {
      id: data.id,
      title: data.title,
      time: data.time,
      content: data.content,
    })
  }


  const [cancel, setCancel] = useState<Boolean>(true)

  function actionCancel(){
    if(cancel){
      setCancel(false)
    }else{
      setCancel(true)
    }
  }

  return (
    <>
      <div className={classNames(cancel ? styled.hide : '')}>
        <Modal actionCancel={actionCancel} actionCheck={Delete}/>
      </div>
      
      <form className={styled.add}>
        <section className={styled.card} id={data.id}>
            <span></span>

            <article>
              <h2>{data.title}</h2>
              <time>{data.time}</time>

              <textarea value={data.content} onChange={(e)=> {setData({...data, content: e.target.value})}}></textarea>
            </article>
        </section>


        <div className="buttons">
          <Button type={false} color='red' icon={DeleteIcon} action={actionCancel}/>
          <Button type={false} color='blue' icon={SaveIcon} action={Update} />
        </div>
      </form >
    </>

  )
}
