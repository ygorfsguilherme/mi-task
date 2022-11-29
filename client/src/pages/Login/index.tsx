import { Field, Form, Formik } from 'formik'
import { Link, useNavigate } from 'react-router-dom'
import Button from '../../components/Button'
import Logo from '../../components/Logo'
import styled from './Login.module.scss'

export default function Login() {
  const nav = useNavigate()
  const token = localStorage.getItem('mitask-token')

  function handleLogin(values: {}){
    localStorage.setItem('mitask-token', '123134')
    nav('/home')
  }

  return (
    <section className={styled.container__login}>
      <Logo />

      <Formik initialValues={{}} onSubmit={handleLogin}>
        <Form className={styled.login}>
          <Field 
            className={styled.input}
            name='email'
            placeholder='E-mail'
          />

          <Field
            type='password'
            className={styled.input}
            name='senha'
            placeholder='Senha'
          />
          
          <Link className={styled.redirect} 
            to="/register">Não tem conta? Registre-se</Link>
          
          <Button>Login</Button>
        </Form>
      </Formik>
    </section>

  )
}
