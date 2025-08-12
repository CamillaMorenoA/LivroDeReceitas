import React from 'react';
import './modal.css';
export default function Modal({ isOpen, onClose, children }) {
  if (!isOpen) return null; // Não renderiza nada se não estiver aberto

    return <div className="modal-overlay" onClick={onClose}>
    <div className="modal-content" onClick={e => e.stopPropagation()}>
      <button className="modal-close-btn" onClick={onClose}>&times;</button>
      {children}
    </div>
  </div>
  }
  