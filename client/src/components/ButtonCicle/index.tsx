import { Link } from 'react-router-dom'
import styled from './Button.module.scss'

export default function Button() {
  return (
    <button className={styled.button__cicle}>
      <Link to="/add" className={styled.link}></Link>
    </button>
  )
}
