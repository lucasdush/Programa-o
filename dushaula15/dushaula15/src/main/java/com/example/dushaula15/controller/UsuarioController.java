package com.example.dushaula15.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dushaula15.dto.UsuarioRequestDTO;
import com.example.dushaula15.dto.UsuarioResponseDTO;
import com.example.dushaula15.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

@Autowired
private UsuarioService usuarioService;
@PostMapping
public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto){
usuarioService.salvarUsuario(dto);
return ResponseEntity.created(null).body(Map.of(
    "mensagem", "Usuario cadastrado com sucesso","sucesso", true
));

}

@GetMapping 
public ResponseEntity<List<UsuarioResponseDTO>> listar(){
    return ResponseEntity.ok().body(usuarioService.listarTodos());
    
}
}