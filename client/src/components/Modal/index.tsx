import React from 'react'
import Button from '../ButtonCicle'
import CancelIcon from '../../assets/icon/cancel.svg'
import CheckIcon from '../../assets/icon/check.svg'
import styled from './Modal.module.scss'
import classNames from 'classnames'
import { IModal } from '../../interface/IModal'

interface Props extends IModal {}

export default function Modal({actionCancel, actionCheck}:Props) {

  return (
    <div className={classNames(styled.container__modal)}>
        <div className={styled.modal}>

            <p className={styled.message}>Deseja executar essa ação?</p>

            <div className={styled.buttons}>
                <Button icon={CancelIcon} color={'red'} action={actionCancel} />
                <Button icon={CheckIcon} color={'green'} action={actionCheck} />
            </div>
        </div>
    </div>
  )
}
