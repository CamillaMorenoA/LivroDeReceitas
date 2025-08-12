package com.example.livrodereceitasapi.Controller;

import com.example.livrodereceitasapi.Service.ReceitaService;
import com.example.livrodereceitasapi.Model.Receita;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
    private final ReceitaService service;

    public ReceitaController(ReceitaService service) {
        this.service = service;
    }

    @PostMapping
    public Receita criar(@RequestBody Receita receita) {
        return service.criarReceita(receita);
    }

    @GetMapping
    public List<Receita> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/categoria/{idCategoria}")
    public List<Receita> listarPorCategoria(@PathVariable Long idCategoria) {
        return service.listarPorCategoria(idCategoria);
    }
}
