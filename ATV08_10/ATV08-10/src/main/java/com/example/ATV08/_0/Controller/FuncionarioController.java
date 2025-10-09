package com.example.ATV08._0.Controller;

import com.example.ATV08._0.model.FuncionarioModel;
import com.example.ATV08._0.Service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> listar() {
        return ResponseEntity.ok(funcionarioService.listarFuncionarios());
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar(@RequestBody FuncionarioModel funcionario) {
        return ResponseEntity.ok(funcionarioService.salvarFuncionario(funcionario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioModel> atualizar(@PathVariable UUID id, @RequestBody FuncionarioModel funcionario) {
        return ResponseEntity.ok(funcionarioService.atualizarFuncionario(id, funcionario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        funcionarioService.deletarFuncionario(id);
        return ResponseEntity.noContent().build();
    }
}
