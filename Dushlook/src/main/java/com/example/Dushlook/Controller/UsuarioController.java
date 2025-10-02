package com.example.Dushlook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dushlook.Service.UsuarioService;
import com.example.Dushlook.Model.UsuarioModel;
import java.util.List;


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
public ResponseEntity<UsuarioModel> salvarUsuario(UsuarioModel usuario){
    usuarioService.salvarUsuario(usuario);
    return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
}



}
