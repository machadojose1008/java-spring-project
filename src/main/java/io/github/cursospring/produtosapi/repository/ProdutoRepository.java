package io.github.cursospring.produtosapi.repository;

import io.github.cursospring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
