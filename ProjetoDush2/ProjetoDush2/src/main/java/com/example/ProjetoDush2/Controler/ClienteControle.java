package com.example.ProjetoDush2.Controler;


import com.example.ProjetoDush2.model.Cliente;
import com.example.ProjetoDush2.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteControle {

    private ClienteRepository clienteRepository;

    public ClienteControle(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List <Cliente> listarTodos(){
    return clienteRepository.findAll();
}

@PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
    clienteRepository.save(cliente);
    return ResponseEntity.status(HttpStatus.OK).body(cliente);

}


}

