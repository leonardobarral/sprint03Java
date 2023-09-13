package org.example.repositories;

import org.example.models.Apolice;
import org.example.models.Cliente;

import java.util.List;

public class ApoliceRepository extends BaseRepository implements IRepository <Apolice> {
    @Override
    public Apolice findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Apolice> findAll() throws Exception {
        return null;
    }

    @Override
    public void save(Apolice object) throws Exception {

    }

    @Override
    public void update(Apolice object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
