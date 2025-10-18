package com.example.aula.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
