package com.example.takevideo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "item_locacao")
@Entity
public class ItemLocacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Locacao locacao;

    @ManyToOne
    private Filme filme;

    private Integer quantidade;

    private BigDecimal valoritem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValoritem() {
        return valoritem;
    }

    public void setValoritem(BigDecimal valoritem) {
        this.valoritem = valoritem;
    }
}