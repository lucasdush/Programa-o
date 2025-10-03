package com.example.Dushlook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dushlook.Service.UsuarioService;
import com.example.Dushlook.Model.UsuarioModel;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

@Autowired
private UsuarioService usuarioService;

@GetMapping
public List<UsuarioModel> listarUsuarios(){
    return usuarioService.listarUsuarios();
}

@PostMapping
public ResponseEntity<UsuarioModel> salvarUsuario(@RequestBody UsuarioModel usuario) {
    UsuarioModel novoUsuario = usuarioService.salvar(usuario);
    return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
}



}
