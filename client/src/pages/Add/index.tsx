import React from 'react'
import Button from '../../components/ButtonCicle'
import styled from './Add.module.scss'

export default function Add() {
  return (
    <div className={styled.add}>
        <h3>Titulo</h3>
        <input type="text" />
        <textarea></textarea>

        <Button />
    </div>
  )
}
