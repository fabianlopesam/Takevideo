package com.example.takevideo.repository;

import com.example.takevideo.model.ItemLocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sun.util.resources.cldr.guz.LocaleNames_guz;

import java.util.Optional;

public interface ItensLocacaoRepository extends JpaRepository<ItemLocacao, Long> {
    @Modifying
    @Query( value = "UPDATE item_locacao JOIN filmes SET valoritem = quantidade * filmes.valorunitario WHERE locacao_id = :id AND filme_id = filmes.id", nativeQuery = true)
    void updatevaloritem(@Param("id") Long id);
}