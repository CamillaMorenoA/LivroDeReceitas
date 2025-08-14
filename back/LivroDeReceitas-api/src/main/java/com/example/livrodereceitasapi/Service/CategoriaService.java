package com.example.livrodereceitasapi.Service;

import com.example.livrodereceitasapi.Model.Categoria;
import com.example.livrodereceitasapi.Repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class CategoriaService {
    private final CategoriaRepository categoriarepository;

    public CategoriaService(CategoriaRepository repository) {
        this.categoriarepository = repository;
    }

    public List<Categoria> listarTodas() {
        return categoriarepository.findAll();
    }

    public List<Categoria> buscarPorNome(String nome) {
        return categoriarepository.findByNomeContainingIgnoreCase(nome);
    }

    public Categoria criar(Categoria categoria){
        return categoriarepository.save(categoria);
    }
}
