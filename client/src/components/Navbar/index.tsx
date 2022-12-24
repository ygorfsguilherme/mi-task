import React, { Children } from 'react'
import { useLocation } from 'react-router-dom';
import { searchData } from '../../interface/ISearchData';
import Back from '../Back';
import SearchBar from '../SearchBar';
import styled from './Navbar.module.scss'

interface Props extends searchData{
}

export default function Navbar({data, setData} : Props) {
  const location = useLocation();

  const router = ["/", "/home"]
  
  return (
    <nav className={styled.navbar}>
      { router.includes(location.pathname) ? <SearchBar data={data} setData={setData} /> : <Back />}
      <span className={styled.perfil}></span>
    </nav>
  )
}
