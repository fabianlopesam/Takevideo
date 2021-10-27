package com.example.takevideo.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "locacoes")
@Entity
public class Locacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    private Clientes cliente;
    @OneToMany(mappedBy = "id")
    private List<Filmes> filmes;
    private Long quantidade;
    private double valorlocacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Clientes getClientes() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }

    public Long getQuantidade() {
        return  quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorlocacao() {
        return valorlocacao;
    }

    public void  setValorlocacao(double valorlocacao) {
        this.valorlocacao = valorlocacao;
    }
}