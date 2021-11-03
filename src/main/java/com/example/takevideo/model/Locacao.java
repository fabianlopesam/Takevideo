package com.example.takevideo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "locacoes")
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private Date datalocacao;
    private Date datadevolucao;

    @OneToMany(mappedBy = "locacao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItemLocacao> itens = new ArrayList<>();

    private BigDecimal valorlocacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public List<ItemLocacao> getItens() {
        return itens;
    }

    public void setItens(List<ItemLocacao> itens) {
        this.itens = itens;
    }

    public void addToItens(ItemLocacao item) {
        item.setLocacao(this);
        this.itens.add(item);
    }

    public BigDecimal getValorlocacao() {
        return valorlocacao;
    }

    public void setValorlocacao(BigDecimal valorlocacao) {
        double valortotal = 0;
        for (ItemLocacao itemLocacao : itens) {
            valortotal += itemLocacao.getValoritem().doubleValue();
        }
        this.valorlocacao = BigDecimal.valueOf(valortotal) ;
  //      this.valorlocacao = valorlocacao;
    }
}