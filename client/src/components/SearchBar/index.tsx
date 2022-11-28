import styled from './Search.module.scss'
import lupa from '../../assets/icon/lupa.svg'
import { searchData } from '../../interface/ISearchData';
interface Props extends searchData {
}

export default function SearchBar({data, setData}:Props) {
  return (
    <div className={styled.search__bar}>
        <img src={lupa} alt="" />
        <input type="text" value={data} onChange={e => {setData(e.target.value)}} />
    </div>
  )
}