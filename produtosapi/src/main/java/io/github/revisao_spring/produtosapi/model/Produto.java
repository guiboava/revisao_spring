package io.github.revisao_spring.produtosapi.model;

import java.util.Objects;

public class Produto {
    private String id;
    private String name;
    private String describe;
    private Double price;

    public Produto() {
    }

    public Produto(String id, String name, String describe, Double price) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(name, produto.name) && Objects.equals(describe, produto.describe) && Objects.equals(price, produto.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, describe, price);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                '}';
    }
}
