package org.example.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleDatabaseSetup {

    private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String DB_USER = "RM551472";
    private static final String DB_PASSWORD = "041093";

    public static void createTables() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            // Criar tabela Cliente
            String createClienteTable = "CREATE TABLE T_RB_CLIENTE (" +
                    "ID_CLIENTE   NUMBER(10) NOT NULL,"+
                    "NOME_CLIENTE VARCHAR2(100) NOT NULL,"+
                    "CPF_CLIENTE  VARCHAR2(11) NOT NULL,"+
                    "NM_USER      VARCHAR2(50) NOT NULL,"+
                    "DT_INCLUSAO  VARCHAR2(10) NOT NULL,"+
                    "DT_FIM VARCHAR2(10)"+
                    ")";
            statement.execute(createClienteTable);

            // Criar tabela Email Cliente
            String createEmailClienteTable = "CREATE TABLE T_RB_EMAIL_CLIENTE (" +
                    "ID_EMAIL    NUMBER(9) NOT NULL,"+
                    "DS_EMAIL    VARCHAR2(100) NOT NULL,"+
                    "TP_EMAIL    VARCHAR2(20) NOT NULL,"+
                    "ST_EMAIL    CHAR(1) NOT NULL,"+
                    "NM_USER      VARCHAR2(50) NOT NULL,"+
                    "DT_INCLUSAO  VARCHAR2(10) NOT NULL,"+
                    "DT_FIM VARCHAR2(10)"+
                    ")";
            statement.execute(createEmailClienteTable);

            // Criar tabela Apólice
            String createApoliceTable = "CREATE TABLE T_RB_APOLICE (" +
                    "ID_APOLICE      NUMBER(10) NOT NULL,"+
                    "ID_CLIENTE      NUMBER(10) NOT NULL,"+
                    "ST_APOLICE      CHAR(1) NOT NULL,"+
                    "DT_VIGENCIA     VARCHAR2(10) NOT NULL,"+
                    "DT_CANCELAMEMTO VARCHAR2(10),"+
                    "DT_ENCERRAMENTO VARCHAR2(10),"+
                    "NM_USER      VARCHAR2(50) NOT NULL,"+
                    "DT_INCLUSAO  VARCHAR2(10) NOT NULL,"+
                    "DT_FIM VARCHAR2(10)"+
                    ")";
            statement.execute(createApoliceTable);

            // Criar tabela ClienteTelefone
            String createClienteTelefoneTable = "CREATE TABLE T_RB_TELEFONE_CLIENTE (" +
                    "id_telefone NUMBER(9) NOT NULL,"+
                    "nr_ddi      NUMBER(3) NOT NULL,"+
                    "nr_ddd      NUMBER(3) NOT NULL,"+
                    "nr_telefone NUMBER(10) NOT NULL,"+
                    "tp_telefone VARCHAR2(20) NOT NULL,"+
                    "st_telefone CHAR(1) NOT NULL,"+
                    "id_cliente  NUMBER(10) NOT NULL,"+
                    "NM_USER      VARCHAR2(50) NOT NULL,"+
                    "DT_INCLUSAO  VARCHAR2(10) NOT NULL,"+
                    "DT_FIM VARCHAR2(10)"+
                    ")";
            statement.execute(createClienteTelefoneTable);

            // Criar tabela ClienteEndereco
            String createClienteEnderecoTable = "CREATE TABLE T_RB_ENDERECO_CLIENTE (" +
                    "ID_CLIENTE          NUMBER(10) NOT NULL,"+
                    "ID_LOGRADOURO       NUMBER(10) NOT NULL,"+
                    "NR_RUA_ENDERECO     NUMBER(5) NOT NULL,"+
                    "NM_PONTO_REFERENCIA VARCHAR2(100),"+
                    "NM_USER      VARCHAR2(50) NOT NULL,"+
                    "DT_INCLUSAO  VARCHAR2(10) NOT NULL,"+
                    "DT_FIM VARCHAR2(10)"+
                    ")";
            statement.execute(createClienteEnderecoTable);

            System.out.println("Tabelas criadas com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}
