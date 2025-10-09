package com.example.ATV08._0.Service;

import com.example.ATV08._0.model.FuncionarioModel;
import com.example.ATV08._0.Repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<FuncionarioModel> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionario) {
        funcionarioRepository.findByEmail(funcionario.getEmail()).ifPresent(f -> {
            throw new IllegalArgumentException("Email já cadastrado");
        });
        return funcionarioRepository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(UUID id, FuncionarioModel funcionarioAtualizado) {
        FuncionarioModel existente = funcionarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Funcionário não encontrado"));

        existente.setNome(funcionarioAtualizado.getNome());
        existente.setEmail(funcionarioAtualizado.getEmail());
        existente.setCargo(funcionarioAtualizado.getCargo());

        return funcionarioRepository.save(existente);
    }

    public void deletarFuncionario(UUID id) {
        if (!funcionarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado");
        }
        funcionarioRepository.deleteById(id);
    }
}
