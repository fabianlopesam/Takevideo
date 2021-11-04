package com.example.takevideo.repository;

import com.example.takevideo.model.ItemLocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sun.util.resources.cldr.guz.LocaleNames_guz;

import java.util.Optional;

public interface ItensLocacaoRepository extends JpaRepository<ItemLocacao, Long> {

}