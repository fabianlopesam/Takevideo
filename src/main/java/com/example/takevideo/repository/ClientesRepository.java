package com.example.takevideo.repository;

import com.example.takevideo.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    @Override
    List<Clientes> findAll();
}