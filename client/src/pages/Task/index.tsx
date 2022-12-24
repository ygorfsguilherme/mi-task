import { useLocation, useNavigate } from 'react-router-dom'
import Button from '../../components/ButtonCicle'
import { useEffect, useState } from 'react'
import styled from './Task.module.scss'
import DeleteIcon from '../../assets/icon/delete.svg'
import SaveIcon from '../../assets/icon/save.svg'
import { typeData } from '../../interface/ITypeData'
import Modal from '../../components/Modal'
import classNames from 'classnames'
import { HttpDelete, HttpGetId, HttpPut } from '../../utils/http'

export default function Task() {
  const id = useLocation().pathname.substring(100, 11)
  const navigate = useNavigate()

  const [data, setData] = useState<typeData>({})
  const [cancel, setCancel] = useState<Boolean>(true)

  useEffect(()=>{
    HttpGetId(id, setData)
  }, [])

  function actionCancel(){
    cancel ? setCancel(false) : setCancel(true)
  }

  return (
    <>
      <div className={classNames(cancel ? styled.hide : '')}>
        <Modal
          actionCancel={() => cancel ? setCancel(false) : setCancel(true)}
          actionCheck={() => {HttpDelete(id, navigate)}}
        />
      </div>
      
      <form className={styled.add}>
        <section className={styled.card} id={data.id}>
            <span></span>

            <article>
              <h2>{data.title}</h2>
              <time>{data.date}</time>

              <textarea 
                value={data.contents}
                onChange={(e)=> {setData({...data, contents: e.target.value})}}
              ></textarea>
            </article>
        </section>


        <div className="buttons">
          <Button 
            type={false}
            color='red'
            icon={DeleteIcon}
            action={actionCancel}
          />

          <Button 
            type={false}
            color='blue'
            icon={SaveIcon}
            action={() => HttpPut(id, data)}
          />
        </div>
      </form >
    </>

  )
}
