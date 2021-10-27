package com.example.takevideo.repository;

import com.example.takevideo.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FilmesRepository extends JpaRepository<Filme, Long> {
    @Override
    List<Filme> findAll();
}

