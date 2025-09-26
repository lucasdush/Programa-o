package atv11.demo.service;


import atv11.demo.model.Cliente;
import atv11.demo.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente){
        if(clienteRepository.findByEmail(cliente.getEmail()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(UUID id, Cliente cliente){
        Cliente existente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        existente.setNome(cliente.getNome());
        existente.setEmail(cliente.getEmail());
        return clienteRepository.save(existente);
    }

    public void excluir(UUID id){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado.");
        }
        clienteRepository.deleteById(id);
    }
}
