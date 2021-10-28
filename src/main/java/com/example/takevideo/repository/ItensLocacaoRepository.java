package com.example.takevideo.repository;

import com.example.takevideo.model.ItemLocacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensLocacaoRepository extends JpaRepository<ItemLocacao, Long> {
}