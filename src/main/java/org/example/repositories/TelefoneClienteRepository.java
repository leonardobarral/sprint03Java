package org.example.repositories;

import org.example.models.TelefoneCliente;

import java.util.List;

public class TelefoneClienteRepository extends BaseRepository implements IRepository <TelefoneCliente>{
    @Override
    public TelefoneCliente findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<TelefoneCliente> findAll() throws Exception {
        return null;
    }

    @Override
    public void save(TelefoneCliente object) throws Exception {

    }

    @Override
    public void update(TelefoneCliente object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
