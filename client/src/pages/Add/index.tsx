import Button from '../../components/ButtonCicle'
import styled from './Add.module.scss'
import Check from '../../assets/icon/check.svg'
import { Field, Form, Formik} from 'formik'
import  {HttpPost}  from '../../utils/http'
import { useNavigate } from 'react-router-dom'

export default function Add() {
  const navigate = useNavigate()

  const handleCreatePost = (values: any) => {
    HttpPost(values, navigate)
  }

  return (
    <>
      <h3>Titulo</h3>

      <Formik initialValues={{}} onSubmit={handleCreatePost}>
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