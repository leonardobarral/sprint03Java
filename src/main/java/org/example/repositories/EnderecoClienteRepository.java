package org.example.repositories;

import org.example.models.EnderecoCliente;

import java.util.List;

public class EnderecoClienteRepository extends BaseRepository implements IRepository <EnderecoCliente>{
    @Override
    public EnderecoCliente findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<EnderecoCliente> findAll() throws Exception {
        return null;
    }

    @Override
    public void save(EnderecoCliente object) throws Exception {

    }

    @Override
    public void update(EnderecoCliente object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
