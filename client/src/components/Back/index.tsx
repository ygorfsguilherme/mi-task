import React from 'react'
import { Link } from 'react-router-dom'
import styled from './Back.module.scss'
import arrowBack from '../../assets/icon/back-arrow.svg'

export default function Back() {
  return (
    <Link className={styled.back__arrow} to="/">
        <img src={arrowBack} alt="" />
    </Link>
  )
}
