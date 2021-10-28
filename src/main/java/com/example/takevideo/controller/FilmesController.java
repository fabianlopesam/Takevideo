package com.example.takevideo.controller;
import com.example.takevideo.model.Filme;
import com.example.takevideo.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping(path="/filmes") // This means URL's start with /demo (after Application path)

public class FilmesController {
    @Autowired
    private FilmesRepository filmesRepository;

    @PostMapping(value = "novo") // Map ONLY POST Requests
    @ResponseBody
    public Filme novoFilme(@RequestBody Filme filme){
        return filmesRepository.save(filme);
    }

    @GetMapping(value = "todos")
    public @ResponseBody Iterable<Filme> todosFilmes() {
        return filmesRepository.findAll();
    }

    @GetMapping(value = "todosantigo")
    @ResponseBody
    public ResponseEntity<List<Filme>> listaFilmes(){
        List<Filme> filmes = filmesRepository.findAll();
        return new ResponseEntity<>(filmes, HttpStatus.OK);
    }

}
