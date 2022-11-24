import { useLocation } from 'react-router-dom';
import Button from '../../components/ButtonCicle'
import Card from '../../components/Card'
import styled from './Home.module.scss'

export default function Home() {


  return (
    <div className={styled.home}>
      <Card />
      <Card />

      <Button />
    </div>
  )
}
