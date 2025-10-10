package com.example.lucasdush.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.lucasdush.Model.Funcionario;
import com.example.lucasdush.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Optional<Funcionario> buscarPorId(Long id) {
        return funcionarioRepository.findById(id);
    }

    public boolean existePorId(Long id) {
        return funcionarioRepository.existsById(id);
    }

    public void deletarPorId(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
