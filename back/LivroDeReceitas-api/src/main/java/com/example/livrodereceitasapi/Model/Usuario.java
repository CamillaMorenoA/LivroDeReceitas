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

}
