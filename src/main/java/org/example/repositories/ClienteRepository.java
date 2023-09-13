package org.example.repositories;

import org.example.models.Cliente;

import java.util.List;

public class ClienteRepository extends BaseRepository implements IRepository <Cliente>{
    @Override
    public Cliente findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        return null;
    }

    @Override
    public void save(Cliente object) throws Exception {

    }

    @Override
    public void update(Cliente object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
