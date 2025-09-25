package com.example.LucasDushATV10.Repository;

import com.example.LucasDushATV10.Model2.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.LucasDushATV10.Model.Funcionario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
