import '../App.css';
import Modal from '../components/modal/modal';
import Categoria from '../components/categoria/categoria.js';
import categoriasMock from '../mocks/categorias.mock.js';
import React, { useState } from 'react'
import Card from '../components/card/card';
import receitasMock from '../mocks/receitas.mock.js';
export default function Home() {
      const [modalOpen, setModalOpen] = useState(false);
    
      const [modalRecipeOpen, setModalRecipeOpen] = useState(false);
      const [categorias, setCategorias] = useState(categoriasMock);
      const [receitas, setReceitas] = useState(receitasMock);

  return     <div >
        <div className="navbar">
          <a>Fazer Login</a>
          <button  onClick={() => setModalOpen(true)} className="botao">Criar Receita</button>
  
        </div>
        <div className="div-titulo">
          <h1 className="titulo"> Livro de Receitas</h1>
          <p className="subtitulo">Compartilhe e aprenda a como fazer qualquer receita</p>
        </div>
  
        <h2 className="h2-categorias">Categorias</h2>
        <div className="div-categorias">
        {categorias.map((categoria, index) => (
            <Categoria
              key={index}
              nome={categoria.nome}
              urlImagem={categoria.imagem}
  
            />
          ))}
        </div>
  
        <h2 className="h2-categorias">Receitas</h2>
        <div style={{ display: 'flex', justifyContent: 'center', marginBottom: '20px', width: '100%', alignItems: 'center' }}>
        <div className="div-cards">
        {receitas.map((receita, index) => (
          <Card
            key={index}
            title={receita.titulo}
            image={receita.imagem}
            description={receita.descricao}
          ></Card>
        ))}
        </div>
        </div>
  
        <Modal isOpen={modalOpen} onClose={() => setModalOpen(false)}>
          <div className="modal-login-div">
            <h2>Login</h2>
            <div className="modal-inputs">
              E-mail:
              <input className="input-modal" type="email" placeholder="Insira seu e-mail" />
              Senha:
              <input className="input-modal"  type="password" placeholder="Insira sua senha" />
            </div>
            <button className="botao-modal">Entrar</button>
          </div>
        </Modal>

        <Modal isOpen={modalRecipeOpen} onClose={() => setModalOpen(false)}>
          <div className="modal-recipe-div">
            <h2>Login</h2>
          </div>
        </Modal>
      </div>;
}


