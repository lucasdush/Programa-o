package com.example.dushaula1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dushaula1.dto.UsuarioRequestDTO;
import com.example.dushaula1.dto.UsuarioResponseDTO;
import com.example.dushaula1.model.UsuarioModel;
import com.example.dushaula1.repository.UsuarioRepository;

@Service
public class UsuarioService {

@Autowired

private UsuarioRepository usuarioRepository;

@Autowired

private BCryptPasswordEncoder bCryptPasswordEncoder;

//salvar usuario

public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
    if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()) {
        throw new IllegalArgumentException("Email ja cadastrado");
    }

    UsuarioModel usuario = new UsuarioModel();
    usuario.setNome(usuarioRequestDTO.getNome());
    usuario.setEmail(usuarioRequestDTO.getEmail());
    
    // criptografar a senha

    usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));
    usuarioRepository.save(usuario);
    return usuario;
}

//consultar todos os usuarios

public List<UsuarioResponseDTO> listarTodos() {
    return usuarioRepository
        .findAll()
        .stream()
        .map(usuario -> new UsuarioResponseDTO(usuario.getNome(), usuario.getEmail()))
        .toList();
}

//Atualizar usuario por id

public UsuarioModel atualizarUsuario (Long id, UsuarioRequestDTO dto){
    if (!usuarioRepository.existsById(id)) {
        throw new RuntimeException("Usuario nao encontrado");
    }

    UsuarioModel atualizarUsuario = new UsuarioModel();
    atualizarUsuario.setId(id);
    atualizarUsuario.setNome(dto.getNome());
    atualizarUsuario.setEmail(dto.getEmail());
    atualizarUsuario.setSenha(bCryptPasswordEncoder.encode(dto.getSenha()));
    usuarioRepository.save(atualizarUsuario);
    return atualizarUsuario;
}

// Excluir usuario por id

public void excluirUsuario (Long id){
    if (!usuarioRepository.existsById(id)) {
        throw new RuntimeException("Usuario nao encontrado");
    }
    usuarioRepository.deleteById(id);

}




}
