package org.example.Services;

import org.example.models.Cliente;
import org.example.repositories.ClienteRepository;


import java.util.List;

public class ClienteService {

    //FACADE DESIGN PATTERN
    private final ClienteRepository clienteRepository;

    public ClienteService() {
        this.clienteRepository = new ClienteRepository();
    }

    // FIM DO FACADE
    public Cliente findById(Long id) throws Exception {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID inválido fornecido: " + id);
        }
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAll() throws Exception{
        return clienteRepository.findAll();
    }

    public boolean save(Cliente cliente) throws Exception {
        if (cliente == null)
            throw new IllegalArgumentException("Cliente fornecido é nulo");
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do Cliente é inválido");

        clienteRepository.save(cliente);
        return true;
    }

    public boolean update(Cliente cliente) throws Exception {
        if (cliente == null)
            throw new IllegalArgumentException("Cliente fornecida é nulo");
        if ( cliente.getId() == 0) //country.getId() == null ||
            throw new IllegalArgumentException("Id do Cliente fornecido é nulo");
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do Clinte é inválido");

        clienteRepository.update(cliente);
        return true;
    }

    public boolean delete(Long id) throws Exception {
        if (id == null || id == 0)
            throw new IllegalArgumentException("Id do Cliente fornecido é nulo");
        clienteRepository.delete(id);
        return true;
    }
}
