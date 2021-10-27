package com.example.takevideo.model;

import javax.persistence.*;

@Table(name = "filmes")
@Entity
public class Filmes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private double valorunitario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void  setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }
}