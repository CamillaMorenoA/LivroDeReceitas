package com.example.livrodereceitasapi.Controller;

import com.example.livrodereceitasapi.Model.Usuario;
import com.example.livrodereceitasapi.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService service) {
        this.usuarioService = service;
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestParam String email,
                         @RequestParam String senha) {
        return usuarioService.login(email, senha);
    }

}
