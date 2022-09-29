package com.application.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.application.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
