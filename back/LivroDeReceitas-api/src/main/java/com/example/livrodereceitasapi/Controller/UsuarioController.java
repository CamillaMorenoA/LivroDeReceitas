package com.example.livrodereceitasapi.Controller;

import com.example.livrodereceitasapi.dto.Login;
import com.example.livrodereceitasapi.Model.Usuario;
import com.example.livrodereceitasapi.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Usuario login(@RequestBody Login login) {
        return usuarioService.login(login.getEmail(), login.getSenha());
    }

    @GetMapping()
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }


}
