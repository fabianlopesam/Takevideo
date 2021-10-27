package com.example.takevideo.repository;

import com.example.takevideo.model.Clientes;
import com.example.takevideo.model.Locacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LocacoesRepository extends JpaRepository<Locacoes, Long> {
    @Override
    List<Locacoes> findAll();
}