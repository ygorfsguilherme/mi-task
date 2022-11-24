import React, { Children } from 'react'
import { useLocation } from 'react-router-dom';
import Back from '../Back';
import SearchBar from '../SearchBar';
import styled from './Navbar.module.scss'

export default function Navbar() {
  const location = useLocation();
  
  return (
    <nav className={styled.navbar}>
        {location.pathname == '/' ? <SearchBar/> : <Back />}

        <span className={styled.perfil}></span>
    </nav>
  )
}
