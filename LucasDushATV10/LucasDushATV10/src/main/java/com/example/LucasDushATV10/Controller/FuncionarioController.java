package com.example.LucasDushATV10.Controller;


import com.example.LucasDushATV10.Model.Funcionario;
import com.example.LucasDushATV10.Service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Funcionario")

    public class FuncionarioController {

    private FuncionarioService funcionarioService;
     public FuncionarioController(FuncionarioService funcionarioService){
         this.funcionarioService = funcionarioService;
     }

     @GetMapping
    public List<Funcionario> listarFuncionario(){
         return funcionarioService.listarTodos();
     }
     @PostMapping
    public ResponseEntity<Funcionario> salvarFuncionario(@RequestBody Funcionario funcionario){
         funcionarioService.salvar(funcionario);
         return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);

     }
}
