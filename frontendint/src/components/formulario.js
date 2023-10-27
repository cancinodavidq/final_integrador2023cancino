import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import { useState } from 'react';

export function Formulario() {
  const [post, setPost] = useState({
    nombre: '',
    descripcion: '',
    precio: 0, // Inicializado como 0
  });

  const handleInput = (event) => {
    const { name, value } = event.target;
    setPost({
      ...post,
      [name]: name === 'precio' ? parseInt(value) : value, // Convertir a número si es 'precio'
    });
  };

  function handleSubmit(event) {
    event.preventDefault();
    axios
      .post('http://18.220.77.53/producto', post)
      .then((response) => console.log(response))
      .catch((err) => console.log(err));
  }

  return (
    <div className='d-flex align-items-center justify-content-center vh-100 w-100'>
      <div className='w-50 text-center'>
        <h1>Registra el producto</h1>
        <br />
        <br />
        <form onSubmit={handleSubmit}>
          Nombre: <input type='text' onChange={handleInput} name='nombre'></input>
          <br />
          <br />
          Descripción: <input type='text' onChange={handleInput} name='descripcion'></input>
          <br />
          <br />
          Precio: <input type='number' onChange={handleInput} name='precio'></input>
          <br />
          <br />
          <button className='btn btn-primary'>Registrar Producto</button>
        </form>
      </div>
    </div>
  );
}