package com.example.ATV08._0.Repository;

import com.example.ATV08._0.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, UUID> {
    Optional<FuncionarioModel> findByEmail(String email);
}
