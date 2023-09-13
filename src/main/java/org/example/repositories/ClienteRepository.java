package org.example.repositories;

import org.example.models.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    public void save(Cliente cliente) throws Exception {

        var query = "INSERT INTO T_RB_CLIENTE (ID_CLIENTE,NOME_CLIENTE,CPF_CLIENTE,NM_USER,DT_INCLUSAO,DT_FIM) VALUES (?,?,?,?,?,?)";
        //Tenta conectar com o banco
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            //seta os parametros
            ps.setString(1, String.valueOf(cliente.getId()));
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getUser());
            ps.setString(5, cliente.getDataCadastro());
            ps.setString(6, cliente.getDataFim());
            //Executa o comando
            ps.executeUpdate();
        }


    }

    @Override
    public void update(Cliente object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }
}
