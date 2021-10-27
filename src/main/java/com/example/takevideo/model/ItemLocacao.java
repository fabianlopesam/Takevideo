package com.example.takevideo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "item_locacao")
@Entity
public class ItemLocacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long quantidade;
    private BigDecimal valoritem;

    @OneToMany(mappedBy = "id")
    private List<Filme> filmes;

    public List<Filme> getFilmes() {
        return filmes;
    }
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public Long getQuantidade() {
        return  quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValoritem() {
        return valoritem;
    }

    public void  setValorlocacao(BigDecimal valoritem) {
        this.valoritem = valoritem;
    }
}