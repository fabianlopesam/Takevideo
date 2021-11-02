package com.example.takevideo.controller;
import com.example.takevideo.model.Locacao;
import com.example.takevideo.repository.LocacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/locacoes") // This means URL's start with /demo (after Application path)

public class LocacoesController {
    @Autowired
    private LocacoesRepository locacoesRepository;

    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Locacao> salvar (@RequestBody Locacao locacao){
        Locacao novo = locacoesRepository.save(locacao);
        return new ResponseEntity<>(novo, HttpStatus.CREATED);
    }

    @GetMapping(value = "todos")
    public @ResponseBody Iterable<Locacao> todasLocacoes() {
        return locacoesRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Locacao> buscar(@PathVariable(value = "id") Long id) {
        Locacao b = locacoesRepository.findById(id).get();
        return ResponseEntity.ok().body(b);
    }

    @DeleteMapping("{id}")
    public String deletar(Long id){
        Locacao d = locacoesRepository.findById(id).get();
        locacoesRepository.delete(d);
        return "Deletado";
    }

    @PutMapping("{id}")
    public  ResponseEntity<Locacao> alterar (@RequestBody Locacao locacao, @PathVariable Long id) {
        Locacao altera = locacoesRepository.findById(id).get();
        altera.setDatalocacao(locacao.getDatalocacao());
        altera.setDatadevolucao(locacao.getDatadevolucao());
        return ResponseEntity.ok(locacoesRepository.save(altera));
    }

}
