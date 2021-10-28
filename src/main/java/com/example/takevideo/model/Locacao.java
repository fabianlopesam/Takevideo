package com.example.takevideo.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "locacoes")
@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private Date datalocacao;
    private Date datadevolucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClientes() {
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

}