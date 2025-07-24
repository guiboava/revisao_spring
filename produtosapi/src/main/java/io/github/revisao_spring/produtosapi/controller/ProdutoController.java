package io.github.revisao_spring.produtosapi.controller;

import io.github.revisao_spring.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return produto;
    }

}
