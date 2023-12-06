package com.example.ProdutosDigitais.Produtos.controller;


import com.example.ProdutosDigitais.Produtos.domain.Produto;
import com.example.ProdutosDigitais.Produtos.model.request.ProdutoDetailRequest;
import com.example.ProdutosDigitais.Produtos.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("produtos")
@Log4j2
@RequiredArgsConstructor
public class ProdutoController {

   // public List<Produto> produtos;
    public ProdutoService produtoService;

    @GetMapping(path = "list")
    public List<Produto> list() {
        return List.of(new Produto());
    }

    @PostMapping(path = "list1", consumes = {"char/text", "application/*"})
    public ResponseEntity<Produto> createProduto(@RequestBody ProdutoDetailRequest produtoDetailRequest) {

        Produto produto = new Produto();

        produto.setId(produtoDetailRequest.getId());
        produto.setNome(produtoDetailRequest.getNome());
        produto.setPrice(produtoDetailRequest.getPrice());

        return new ResponseEntity<Produto>(produto, HttpStatus.OK);
    }
}
