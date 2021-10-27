package com.example.takevideo.controller;
import com.example.takevideo.model.Filmes;
import com.example.takevideo.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/filmes") // This means URL's start with /demo (after Application path)

public class FilmesController {
    @Autowired
    private FilmesRepository filmesRepository;

    @PostMapping(path="/novo") // Map ONLY POST Requests
    public @ResponseBody
    String novoFilme (@RequestParam String nome) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Filmes n = new Filmes();
        n.setNome(nome);
        filmesRepository.save(n);
        return "Salvo";
    }

    @GetMapping(path="/todos")
    public @ResponseBody Iterable<Filmes> todosFilmes() {
        // This returns a JSON or XML with the users
        return filmesRepository.findAll();
    }
}
