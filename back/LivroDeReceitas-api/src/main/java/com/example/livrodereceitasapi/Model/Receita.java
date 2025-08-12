package com.example.livrodereceitasapi.Model;

import com.example.livrodereceitasapi.Model.Usuario;
import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "receita")
public class Receita {
    @Id
    @Column(nullable = false, length = 100)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(length = 2000)
    private String descricao;

    @Column(length = 1000)
    private String ingredientes;

    @Column(length = 150)
    private String resumo;

    @Lob
    private String imagem;

    @Column(name = "tempo_preparo")
    private LocalTime tempoPreparo;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public LocalTime getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(LocalTime tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}