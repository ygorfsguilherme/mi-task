import { useLocation, useNavigate } from 'react-router-dom';
import Button from '../../components/ButtonCicle'
import Card from '../../components/Card'
import styled from './Home.module.scss'
import Plus from '../../assets/icon/plus.svg'
import axios from "axios"
import { useEffect, useState } from 'react';
import { typeData } from '../../interface/ITypeData';
import { searchData } from '../../interface/ISearchData';
import '../../assets/styles/containerButtons.scss'

interface Props extends searchData{}

export default function Home({ data }:Props) {
  const navigate = useNavigate()
  const [task, setData] = useState([])

  useEffect(() => {
    if(data == '' || data == undefined){
      axios.get('http://localhost:3000/task')
        .then(response => setData(response.data))
    }else {
      axios.get(`http://localhost:3000/task/?title=${data}`)
        .then(response => setData(response.data))
    }
  }, [data])

  return (
    <div className={styled.home}>
      
      <div className={styled.container__task}>
        {task.map( (task: typeData) => <Card id={task.id} title={task.title} time={task.time} content={task.content} />)}
      </div>
      
      <div className="buttons">
        <Button color='' icon={Plus} action={()=> navigate("/user/add")} />
      </div>
    </div>
  )
}
