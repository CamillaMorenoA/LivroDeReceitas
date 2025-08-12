package com.example.livrodereceitasapi.Service;
import com.example.livrodereceitasapi.Model.Usuario;
import com.example.livrodereceitasapi.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository repository) {
        this.usuarioRepository = repository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario login(String email, String senha) {
        try{
            return usuarioRepository.findByEmailAndSenha(email, senha);
        }catch (Exception e){
            return null;
        }
    }
}
