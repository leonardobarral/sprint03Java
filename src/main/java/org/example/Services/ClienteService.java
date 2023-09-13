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

    public boolean save(Cliente country) throws Exception {
        if (country == null)
            throw new IllegalArgumentException("País fornecida é nulo");
        if (country.getNome() == null || country.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do País é inválido");

        clienteRepository.save(country);
        return true;
    }

    public boolean update(Cliente country) throws Exception {
        if (country == null)
            throw new IllegalArgumentException("Artista fornecida é nulo");
        if ( country.getId() == 0) //country.getId() == null ||
            throw new IllegalArgumentException("Id do artista fornecida é nulo");
        if (country.getNome() == null || country.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do artista é inválido");

        clienteRepository.update(country);
        return true;
    }

    public boolean delete(Long id) throws Exception {
        if (id == null || id == 0)
            throw new IllegalArgumentException("Id do artista fornecida é nulo");
        clienteRepository.delete(id);
        return true;
    }
}
