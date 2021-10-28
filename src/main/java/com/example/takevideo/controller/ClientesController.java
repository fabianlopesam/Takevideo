package com.example.takevideo.controller;
import com.example.takevideo.model.Cliente;
import com.example.takevideo.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/clientes") // This means URL's start with /demo (after Application path)

public class ClientesController {
    @Autowired
    private ClientesRepository clientesRepository;

    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Cliente> salvar (@RequestBody Cliente cliente){
        Cliente novo = clientesRepository.save(cliente);
        return new ResponseEntity<>(novo, HttpStatus.CREATED);
    }

    @GetMapping(value = "todos")
    public @ResponseBody Iterable<Cliente> todosClientes() {
        return clientesRepository.findAll();
    }
}
