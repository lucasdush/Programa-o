package com.example.ProjetoDush2.repository;

import com.example.ProjetoDush2.model.Cliente;
import com.example.ProjetoDush2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
