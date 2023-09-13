package org.example.repositories;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseRepository {
    //protected static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    //protected static final String USER = "seu_usuario";
    //protected static final String PASS = "sua_senha";

    protected static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    protected static final String DB_USER = "RM551472";
    protected static final String DB_PASSWORD = "041093";

    protected Connection getConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}