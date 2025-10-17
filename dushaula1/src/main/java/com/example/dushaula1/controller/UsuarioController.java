package com.example.dushaula1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dushaula1.dto.UsuarioRequestDTO;
import com.example.dushaula1.dto.UsuarioResponseDTO;
import com.example.dushaula1.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // CREATE
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto) {
        usuarioService.salvarUsuario(dto);
        return ResponseEntity.created(null).body(Map.of(
            "mensagem", "Usuário cadastrado com sucesso",
            "sucesso", true
        ));
    }

    // READ
    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar() {
        return ResponseEntity.ok().body(usuarioService.listarTodos());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody UsuarioRequestDTO dto) {
        usuarioService.atualizarUsuario(id, dto);
        return ResponseEntity.ok().body(Map.of(
            "mensagem", "Usuário atualizado com sucesso",
            "sucesso", true
        ));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id) {
        usuarioService.excluirUsuario(id);
        return ResponseEntity.ok().body(Map.of(
            "mensagem", "Usuário excluído com sucesso",
            "sucesso", true
        ));
    }
}
