package com.example.LucasDushATV10.Repository;
import com.example.LucasDushATV10.Model.Funcionario;
import com.example.LucasDushATV10.Model3.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
