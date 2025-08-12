package com.example.livrodereceitasapi.Repository;
import com.example.livrodereceitasapi.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
    List<Categoria> findAll();
    List<Categoria> findByNomeContainingIgnoreCase(String nome);
}
