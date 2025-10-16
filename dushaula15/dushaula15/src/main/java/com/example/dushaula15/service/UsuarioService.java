package com.example.dushaula15.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dushaula15.dto.UsuarioRequestDTO;
import com.example.dushaula15.dto.UsuarioResponseDTO;
import com.example.dushaula15.model.UsuarioModel;
import com.example.dushaula15.repository.UsuarioRepository;

@Service
public class UsuarioService {

@Autowired

private UsuarioRepository usuarioRepository;

@Autowired

private BCryptPasswordEncoder bCryptPasswordEncoder;

public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
    if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()) {
        throw new IllegalArgumentException("Usuario ja cadastrado");
    }

    UsuarioModel usuario = new UsuarioModel();
    usuario.setNome(usuarioRequestDTO.getNome());
    usuario.setEmail(usuarioRequestDTO.getEmail());
    usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

    usuarioRepository.save(usuario);
    return usuario;
}

public List<UsuarioResponseDTO> listarTodos() {
    return usuarioRepository
        .findAll()
        .stream()
        .map(usuario -> new UsuarioResponseDTO(usuario.getNome(), usuario.getEmail()))
        .toList();
}

}


