package com.example.atvdush.controller;

import com.example.atvdush.model.Funcionario;
import com.example.atvdush.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/F")
@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @GetMapping
    public List<Funcionario> lista(){
        return funcionarioRepository.findAll();

    }
@PostMapping
    public ResponseEntity<Funcionario> salva(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.OK).body(funcionario);

}
}
