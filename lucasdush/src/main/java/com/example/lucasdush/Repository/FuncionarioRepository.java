package com.example.lucasdush.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lucasdush.Model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
   
}

