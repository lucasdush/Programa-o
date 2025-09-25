package com.example.LucasDushATV10.Service;

import com.example.LucasDushATV10.Model.Funcionario;
import com.example.LucasDushATV10.Repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

private FuncionarioRepository funcionarioRepository;

public FuncionarioService (FuncionarioRepository funcionarioRepository){
    this.funcionarioRepository = funcionarioRepository;

}
//get
public List<Funcionario> listarTodos(){
    return funcionarioRepository.findAll();
}
//post
public Funcionario salvar(Funcionario funcionario){
    // verificar funcionario cadastrado
    if (funcionarioRepository.findByTelefone(funcionario.getTelefone()).isPresent()){
        // encontrar telefone no banco de dados
        throw new RuntimeException("Funcionario já Cadastrado.");
    }
    return funcionarioRepository.save(funcionario);
}
}
