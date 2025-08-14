package com.example.livrodereceitasapi.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "Usuario")
public class Usuario {

    // Se der erro é provavelmente esse id long aqui
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String nome;
    private int idade;
    private String email;
    @Size(min = 2, max = 12, message = "O nome deve ter pelo menos 5 caracteres e no máximo 12")
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, int idade, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Long idUsuario, String nome, int idade, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
