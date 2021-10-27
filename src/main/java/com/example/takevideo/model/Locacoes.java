package com.example.takevideo.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
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
    private Date datalocacao;
    private Date datadevolucao;

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

    public Date getDatalocacao() {
        return datalocacao;
    }
    public void setDatalocacao(Date datalocacao) {
        this.datalocacao = datalocacao;
    }

    public Date getDatadevolucao() {
        return datadevolucao;
    }
    public void setDatadevolucao(Date datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

}