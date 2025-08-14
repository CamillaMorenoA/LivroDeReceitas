package com.example.livrodereceitasapi.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;

    private String nome;

    public Long getIdCategoria() {
        return idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

