package com.example.livrodereceitasapi.Service;

import com.example.livrodereceitasapi.Model.Receita;
import com.example.livrodereceitasapi.Repository.ReceitaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceitaService {

    private final ReceitaRepository Receitarepository;

    public ReceitaService(ReceitaRepository repository) {
        this.Receitarepository = repository;
    }

    public Receita criarReceita(Receita receita) {
        return Receitarepository.save(receita);
    }

    public List<Receita> listarTodas() {
        return Receitarepository.findAll();
    }

    public List<Receita> listarPorCategoria(Long idCategoria) {
        return Receitarepository.findByCategoria_IdCategoria(idCategoria);
    }
}
