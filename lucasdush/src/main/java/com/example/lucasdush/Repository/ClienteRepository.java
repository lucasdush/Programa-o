package com.example.lucasdush.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lucasdush.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
