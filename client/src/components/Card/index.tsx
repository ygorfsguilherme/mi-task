// import { useNavigate } from 'react-router-dom';
import { useNavigate } from 'react-router';
import { typeData } from '../../interface/ITypeData';
import styled from './Card.module.scss';

interface Props extends typeData{}

export default function Card({id, title, date, contents}: Props) {

  const navigate = useNavigate()

  function ViewTask(e: any){
    navigate(`/user/task/${e.currentTarget.id}`)
  }

  return (
    <section className={styled.card} id={id} onClick={ViewTask}>
        <span></span>

        <article>
          <h2>{title}</h2>
          <time>{date}</time>

          <p>{contents?.substring(0, 250)}</p>
        </article>
    </section>
  )
}
