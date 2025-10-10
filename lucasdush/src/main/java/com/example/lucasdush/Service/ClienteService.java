package com.example.lucasdush.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.lucasdush.Model.Cliente;
import com.example.lucasdush.Repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente criar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> atualizar(Long id, Cliente cliente) {
        return clienteRepository.findById(id)
                .map(c -> {
                    cliente.setId(id);
                    return clienteRepository.save(cliente);
                });
    }

    public boolean deletar(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
