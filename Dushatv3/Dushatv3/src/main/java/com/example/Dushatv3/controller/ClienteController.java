package com.example.Dushatv3.controller;

import com.example.Dushatv3.model.Cliente;
import com.example.Dushatv3.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor //subistitui o construtor

    public class ClienteController {
        private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);

    }
}
