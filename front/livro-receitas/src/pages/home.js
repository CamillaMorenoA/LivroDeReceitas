import '../App.css';
import Modal from '../components/modal/modal';
import Categoria from '../components/categoria/categoria.js';
import categoriasMock from '../mocks/categorias.mock.js';
import React, { useState } from 'react';
import Card from '../components/card/card';
import receitasMock from '../mocks/receitas.mock.js';
import ModalLarge from '../components/modalLarge/modal.js';

export default function Home() {
  const [modalOpen, setModalOpen] = useState(false);
  const [modalRecipeOpen, setModalRecipeOpen] = useState(false);
  const [categorias, setCategorias] = useState(categoriasMock);
  const [receitas, setReceitas] = useState(receitasMock);

  // Estados para os inputs do modal de receita
  const [nome, setNome] = useState('');
  const [descricao, setDescricao] = useState('');
  const [imagem, setImagem] = useState(null);

  const handleImageChange = (e) => {
    if (e.target.files && e.target.files[0]) {
      setImagem(URL.createObjectURL(e.target.files[0]));
    }
  };

  
  const handleSubmit = (e) => {
    e.preventDefault();
    const novaReceita = {
      titulo: nome,
      descricao: descricao,
      imagem: imagem,
    };
    
    // Adiciona a nova receita à lista existente
    setReceitas([...receitas, novaReceita]);
    
    // Limpa os campos do formulário
    setNome('');
    setDescricao('');
    setImagem(null);
    
    // Fecha o modal
    setModalRecipeOpen(false);
  };
  
  // ❗ FUNÇÃO ADICIONADA: `handleCloseRecipeModal` para fechar o modal e limpar os estados
  const handleCloseRecipeModal = () => {
    setNome('');
    setDescricao('');
    setImagem(null);
    setModalRecipeOpen(false);
  };

  return (
    <div>
      <div className="navbar">
        <a onClick={() => setModalOpen(true)}>Fazer Login</a>
        <button onClick={() => setModalRecipeOpen(true)} className="botao">
          Criar Receita
        </button>
      </div>
      <div className="div-titulo">
        <h1 className="titulo">Livro de Receitas</h1>
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
            />
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
            <input className="input-modal" type="password" placeholder="Insira sua senha" />
          </div>
          <button className="botao-modal">Entrar</button>
        </div>
      </Modal>

      <ModalLarge
        isOpen={modalRecipeOpen}
        onClose={handleCloseRecipeModal}
      >
        <div className="modal-recipe-div">
          <div className="modal-container">
            <div className="modal-left">
              {imagem ? (
                <img src={imagem} alt="Pré-visualização" className="image-preview" />
              ) : (
                <div className="image-placeholder">
                  <label htmlFor="image-input" className="image-label">
                    Escolha uma imagem
                  </label>
                  <input
                    id="image-input"
                    type="file"
                    accept="image/*"
                    onChange={handleImageChange}
                    className="hidden-input"
                  />
                </div>
              )}
            </div>
            <div className="modal-right">
              <form onSubmit={handleSubmit}>
                <div className="input-group">
                  <label>Titulo:</label>
                  <input
                    type="text"
                    value={nome}
                    onChange={(e) => setNome(e.target.value)}
                  />
                </div>
                <div className="input-group">
                  <label>Passo a passo:</label>
                  <textarea
                    value={descricao}
                    onChange={(e) => setDescricao(e.target.value)}
                  />
                  <label>Ingredientes:</label>
                  <input type="text"></input>
                  <label>Breve resumo:</label>
                  <input type="text" className="input-modal"></input>
                  <label>Categoria:</label>
                  <select >
                    <option value="Doces">Doces</option>
                    <option value="Pratos Principais">Pratos Principais</option>
                    <option value="Vegetarianos">Vegetarianos</option>
                    <option value="Salgados">Salgados</option>
                    <option value="Bebidas"></option>
                  </select>

                   <label>Tempo de preparo (minutos) :</label>
                  <input type="text" className="input-modal"></input>
                </div>
                <div className="modal-actions">
                  <button type="button" onClick={handleCloseRecipeModal}>
                    Cancelar
                  </button>
                  <button type="submit">Salvar</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </ModalLarge>
    </div>
  );
}