import { useNavigate } from 'react-router-dom';
import Button from '../../components/ButtonCicle'
import Card from '../../components/Card'
import styled from './Home.module.scss'
import Plus from '../../assets/icon/plus.svg'
import { useEffect, useState } from 'react';
import { typeData } from '../../interface/ITypeData';
import { searchData } from '../../interface/ISearchData';
import { HttpGetAll, HttpGetTitle } from '../../utils/http';
import axios from 'axios';

interface Props extends searchData{}

export default function Home({ data }:Props) {
  const navigate = useNavigate()
  const [task, setData] = useState([])

  const url_base = "http://localhost:8080/"

  const token = localStorage.getItem("mitask-token")

  useEffect(() => {
    if(data == '' || data == undefined){

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
      console.log("Pegando Tudo")
    }else {
      HttpGetTitle(data, setData)
      console.log("Pegando Por Titulo")
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
            date={task.date}
            contents={task.contents}
          />)}
      </div>
      
      <div className="buttons">
        <Button color='' icon={Plus} action={()=> navigate("/user/add")} />
      </div>
    </div>
  )
}
