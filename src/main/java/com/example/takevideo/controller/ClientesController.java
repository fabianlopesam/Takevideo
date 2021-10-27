package com.example.takevideo.controller;

import com.example.takevideo.model.Cliente;
import com.example.takevideo.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/clientes") // This means URL's start with /demo (after Application path)

public class ClientesController {
    @Autowired
    private ClientesRepository clientesRepository;

    @PostMapping(path="/novo") // Map ONLY POST Requests
    public @ResponseBody String novoCliente (@RequestParam String nome) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Cliente n = new Cliente();
        n.setNome(nome);
        clientesRepository.save(n);
        return "Salvo";
    }

    @GetMapping(path="/todos")
    public @ResponseBody Iterable<Cliente> todosClientes() {
        // This returns a JSON or XML with the users
        return clientesRepository.findAll();
    }
}
