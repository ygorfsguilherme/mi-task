import styled from './Search.module.scss'
import lupa from '../../assets/icon/lupa.svg'

export default function SearchBar() {
  return (
    <div className={styled.search__bar}>
        <img src={lupa} alt="" />
        <input type="text" />
    </div>
  )
}