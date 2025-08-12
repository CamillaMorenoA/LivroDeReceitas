package com.example.livrodereceitasapi.Repository;

import com.example.livrodereceitasapi.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     Usuario findByEmail(String email);
     Usuario findByEmailAndSenha(String email, String senha);

}
