package com.example.ProdutosDigitais.Produtos.domain;

import org.springframework.http.HttpStatusCode;

public class Produto{

    private String nome;
    private int id;
    private double price;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
