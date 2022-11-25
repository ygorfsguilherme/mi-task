import classNames from 'classnames';
import { DetailedHTMLProps, ImgHTMLAttributes } from 'react';
import { Link } from 'react-router-dom'
import styled from './Button.module.scss'

interface Props {
  icon: string;
  color: string;
  action?: VoidFunction;
}

export default function Button({icon, color, action}:Props) {
  return (
      <button type='submit' onClick={action} className={classNames(styled.button__cicle, styled[color])}>
        <img src={icon} alt="" />
      </button>
  )
}
