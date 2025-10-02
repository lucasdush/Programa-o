package com.example.Dushlook.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Dushlook.Model.UsuarioModel;
import com.example.Dushlook.Repository.UsuarioRepository;

public class UsuarioService {
    @Autowired

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioModel> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel salvarUsuario(UsuarioModel usuario){
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Email ja cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

    public UsuarioModel atualizarUsuario(UUID id, UsuarioModel usuario){
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario nao encontrado");
            
        }
        usuario.setId(id);
        return usuarioRepository.save(usuario); 
    }

    public void deletarUsuario(UUID id){
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario nao encontrado");
        }
        usuarioRepository.deleteById(id);
    }

    

 
}
