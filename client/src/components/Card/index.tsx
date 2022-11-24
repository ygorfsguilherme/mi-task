import styled from './Card.module.scss';

const data = {
    title:'titulo',
    time:'23/10/2002',
    content:"Criado em 2011 pelo time do Facebook, o React surgiu com o objetivo de otimizar a atualização e a sincronização de atividades simultâneas no feed de notícias da rede social, entre eles chat, status, listagem de contatos e outros."
}

export default function Card() {
  return (
    <section className={styled.card}>
        <span></span>

        <article>
            <h2>{data.title}</h2>
            <time>{data.time}</time>

            <p>{data.content}</p>
        </article>
    </section>
  )
}
