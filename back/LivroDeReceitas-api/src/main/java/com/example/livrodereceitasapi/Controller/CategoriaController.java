package com.example.livrodereceitasapi.Controller;

import com.example.livrodereceitasapi.Model.Categoria;
import com.example.livrodereceitasapi.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Categoria> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/buscar")
    public List<Categoria> buscarPorNome(@RequestParam String nome) {
        return service.buscarPorNome(nome);
    }

    @PostMapping()
    public Categoria criarCategoria(@RequestBody Categoria categoria){
        return service.criar(categoria);
    }

}
