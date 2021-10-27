package com.example.takevideo.repository;

import com.example.takevideo.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
    @Override
    List<Filmes> findAll();
}

