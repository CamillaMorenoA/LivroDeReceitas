import React from 'react';
export default function Categoria( { nome, urlImagem } ) {

    return <div>
<div style={{ position: 'relative', width: '200px', height: '100px' }}>
  <img 
    src={urlImagem} 
    alt="Descrição" 
    style={{ width: '100%', height: '100%', objectFit: 'cover' }} 
  />
  
  {}
  <div 
    style={{
      position: 'absolute',
      top: 0, left: 0, right: 0, bottom: 0,
      backgroundColor: 'rgba(0, 0, 0, 0.5)', 
      display: 'flex',
      justifyContent: 'center',
      alignItems: 'center',
      color: 'white',
      fontSize: '14px',
      fontWeight: 'bold',
      padding: '10px',
      textAlign: 'center',
    }}
  >
{nome}  </div>
</div>
        
            
  </div>
  }
  