// import { useNavigate } from 'react-router-dom';
import { useNavigate } from 'react-router';
import { typeData } from '../../interface/ITypeData';
import styled from './Card.module.scss';

interface Props extends typeData{}

export default function Card({id, title, time, content}: Props) {

  const navigate = useNavigate()

  function ViewTask(even: any){
    navigate(`/user/task/${even.currentTarget.id}`)
  }

  return (
    <section className={styled.card} id={id} onClick={ViewTask}>
        <span></span>

        <article>
          <h2>{title}</h2>
          <time>{time}</time>

          <p>{content?.substring(0, 250)}</p>
        </article>
    </section>
  )
}
