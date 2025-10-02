package com.example.Dushlook.Repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dushlook.Model.UsuarioModel;

@Repository

public interface UsuarioRepository extends JpaRepository< UsuarioModel, UUID> {
 Optional<UsuarioModel> findByEmail(String email);
 
    


}
