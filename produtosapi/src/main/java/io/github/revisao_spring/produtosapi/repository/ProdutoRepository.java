package io.github.revisao_spring.produtosapi.repository;

import io.github.revisao_spring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByName(String name);

}
