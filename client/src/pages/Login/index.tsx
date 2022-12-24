import axios from 'axios'
import { Field, Form, Formik } from 'formik'
import { Link, useLocation, useNavigate } from 'react-router-dom'
import Button from '../../components/Button'
import Logo from '../../components/Logo'
import { HttpLogin } from '../../utils/http'
import styled from './Login.module.scss'

export default function Login() {
  const navigate = useNavigate()
  const location = useLocation().pathname

  function handleLogin(values: any){
    HttpLogin(values)

    setTimeout(() => {
      if(location == "/"){
        navigate("/home")
      }else{
        navigate("/")
      }
    }, 4000)
  }

  return (
    <section className={styled.container__login}>
      <Logo />

      <Formik initialValues={{}} onSubmit={handleLogin}>
        <Form className={styled.login}>
          <Field 
            type="email"
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
            to="/register">Não tem conta? Registre-se</Link>
          
          <Button>Login</Button>
        </Form>
      </Formik>
    </section>

  )
}
