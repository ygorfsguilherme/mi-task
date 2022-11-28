import React, { useEffect, useState } from 'react'
import Button from '../../components/ButtonCicle'
import styled from './Add.module.scss'
import Check from '../../assets/icon/check.svg'
import axios from 'axios'
import { typeData } from '../../interface/ITypeData'
import { useNavigate } from 'react-router-dom'
import { Field, Form, Formik, FormikHelpers, FormikValues } from 'formik'
import '../../assets/styles/containerButtons.scss'

export default function Add() {
  const navigate = useNavigate()

  const handleLogin = (values: any) => {
    axios.post("http://localhost:3000/task", values)
    .then(response => {
      if(response.status == 201){
        navigate("/user/home")
      }
    })
  }

  return (
    <>
      <h3>Titulo</h3>

      <Formik initialValues={{}} onSubmit={handleLogin}>
        <Form className={styled.add}>
            <Field type="text" name="title" />
            <Field as="textarea" type="text" name="content" />
            
            <div className="buttons">
              <Button type={true} color='green' icon={Check} />
            </div>
        </Form>
      </Formik>
    </>
  )
}