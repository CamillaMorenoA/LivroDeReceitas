package com.example.livrodereceitasapi.Repository;
import com.example.livrodereceitasapi.Model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ReceitaRepository extends JpaRepository<Receita, String> {
    List<Receita> findAll();
    List<Receita> findByCategoria_IdCategoria(Long idCategoria);
}
