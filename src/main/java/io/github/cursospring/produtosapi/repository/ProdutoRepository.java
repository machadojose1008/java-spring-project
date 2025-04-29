package io.github.cursospring.produtosapi.repository;

import io.github.cursospring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByName(String name);
}
