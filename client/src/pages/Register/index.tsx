import axios from 'axios'
import { Field, Form, Formik } from 'formik'
import { Link, useNavigate } from 'react-router-dom'
import Button from '../../components/Button'
import Logo from '../../components/Logo'
import styled from './Register.module.scss'
import { HttpRegister } from '../../utils/http'

export default function Register() {
  const navigate = useNavigate()
  function handleRegister(values: any){

    HttpRegister({
      name: values.name,
      email: values.email,
      password: values.password
    }, navigate)
    
  //   axios.post("https://upgraded-zebra-xgp6p6rx9vvcwqg-5173.app.github.dev/register", {
  //       name: values.name,
  //       email: values.email,
  //       password: values.password
  //     }).then(result => {
  //       if(result.status == 201){
  //         navigate("/")
  //       }
  //     }).catch(error => console.log('error'));
  }

  return (
    <section className={styled.container__login}>
      <Logo />

      <Formik initialValues={{}} onSubmit={handleRegister}>
        <Form className={styled.login}>
          <Field 
            className={styled.input}
            name='name'
            placeholder='Nome'
          />

          <Field 
            className={styled.input}
            name='email'
            placeholder='E-mail'
          />

          <Field
            type='password'
            className={styled.input}
            name='password'
            placeholder='Senha'
          />
          
          <Link className={styled.redirect} 
            to="/">Tem conta? Fazer login</Link>
          
          <Button>Register</Button>
        </Form>
      </Formik>
    </section>

  )
}
