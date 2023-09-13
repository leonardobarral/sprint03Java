package org.example.repositories;

import org.example.models.Cliente;
import org.example.models.EmailCliente;

import java.util.List;

public class EmailClienteRepository extends BaseRepository implements IRepository <EmailCliente>{
    @Override
    public EmailCliente findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<EmailCliente> findAll() throws Exception {
        return null;
    }

    @Override
    public void save(EmailCliente object) throws Exception {

    }

    @Override
    public void update(EmailCliente object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
