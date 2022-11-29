import { useNavigate } from 'react-router-dom';
import Button from '../../components/ButtonCicle'
import Card from '../../components/Card'
import styled from './Home.module.scss'
import Plus from '../../assets/icon/plus.svg'
import { useEffect, useState } from 'react';
import { typeData } from '../../interface/ITypeData';
import { searchData } from '../../interface/ISearchData';
import { HttpGetAll, HttpGetTitle } from '../../utils/http';

interface Props extends searchData{}

export default function Home({ data }:Props) {
  const navigate = useNavigate()
  const [task, setData] = useState([])

  useEffect(() => {
    if(data == '' || data == undefined){
      HttpGetAll(setData)
    }else {
      HttpGetTitle(data, setData)
    }
  }, [data])

  return (
    <div className={styled.home}>
      
      <div className={styled.container__task}>
        {task.map( (task: typeData) => 
          <Card 
            id={task.id}
            key={task.id}
            title={task.title}
            time={task.time}
            content={task.content}
          />)}
      </div>
      
      <div className="buttons">
        <Button color='' icon={Plus} action={()=> navigate("/user/add")} />
      </div>
    </div>
  )
}
