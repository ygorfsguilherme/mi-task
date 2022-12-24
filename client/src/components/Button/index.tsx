import classNames from 'classnames';
import React, { DetailedHTMLProps, ImgHTMLAttributes } from 'react';
import { Link } from 'react-router-dom'
import styled from './Button.module.scss'

interface Props {
  children: React.ReactNode;
  action?: any;
}

export default function Button({children, action}:Props) {
  return (
      <button type='submit' onClick={action} className={styled.button}>
        {children}
      </button>
  )
}
