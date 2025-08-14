package com.example.livrodereceitasapi.Service;
import com.example.livrodereceitasapi.Controller.UsuarioController;
import com.example.livrodereceitasapi.Model.Usuario;
import com.example.livrodereceitasapi.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository repository) {
        this.usuarioRepository = repository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario login(String email, String senha) {
        try{
            return usuarioRepository.findByEmailAndSenha(email, senha);
        }catch (Exception e){
            return null;
        }
    }
}
