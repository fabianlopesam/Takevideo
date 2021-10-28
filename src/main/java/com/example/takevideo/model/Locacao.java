package com.example.takevideo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "locacoes")
@Entity
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private Date datalocacao;

    private Date datadevolucao;


    @OneToMany(mappedBy = "locacao")
    private List<ItemLocacao> itens;


}