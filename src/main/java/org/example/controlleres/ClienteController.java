package org.example.controlleres;
import org.example.Services.ClienteService;
import org.example.models.*;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClienteController {
    private Scanner scanner;
    private ClienteService clienteService;

    public ClienteController() {
        this.scanner = new Scanner(System.in);
        this.clienteService = new ClienteService();
    }

    public void capturarEMontarCliente() {
        System.out.println("==== Adicionar Novo Cliente ====");

        // Solicita o nome do Cliente
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o código: ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.print("Digite o Código do CPF: ");
        String cpf = scanner.nextLine();

        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        String dataCadastro = formato.format(dataAtual);;

        String nomeUsuario = System.getProperty("user.name");


        //Criando nova apólice
        System.out.println("==== Adicionar Nova Apólice para este Cliente ====");

        System.out.print("Digite o código da apólice: ");
        long idApolice = Long.parseLong(scanner.nextLine());

        //Criando nova Telefone
        System.out.println("==== Adicionar Novo Telefone para este Cliente ====");

        System.out.print("Digite o código do DD: ");
        int ddTelefone = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o Numero: ");
        int nrTelefone = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o Tipo do Telefone: ");
        String tipoTelefone = scanner.nextLine();


        //Criando nova Endereco
        System.out.println("==== Adicionar Novo Endereço para este Cliente ====");
        System.out.print("Digite o Numero na rua: ");
        int numeroRua = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o ponto de referencia: ");
        String pontoReferencia = scanner.nextLine();

        //Criando novo email
        System.out.println("==== Adicionar Novo E-mail para este cliente ====");
        System.out.print("Digite o E-mail: ");
        String emailCliente = scanner.nextLine();

        System.out.print("Pessoal ou profissional: ");
        String tipoEmailCliente = scanner.nextLine();

        var novaApolice = new Apolice(
                idApolice,
                nomeUsuario,
                dataCadastro,
                null,
                "Ativa",
                "22/12/2024",
                null,
                null,
                null
        );

        var novoTelefoneCliente = new TelefoneCliente(
                id,
                nomeUsuario,
                dataCadastro,
                null,
                55,
                ddTelefone,
                nrTelefone,
                tipoTelefone,
                "Ativo"
        );

        var novoEnderecoCliente = new EnderecoCliente(
                id,
                nomeUsuario,
                dataCadastro,
                null,
                id,
                numeroRua,
                pontoReferencia,
                0,
                0
        );

        var novoEmailCliente = new EmailCliente(
                id,
                nomeUsuario,
                dataCadastro,
                null,
                emailCliente,
                tipoEmailCliente,
                "Ativo"
        );


        // Monta o objeto artista
        var novoCliente = new Cliente(
                id,
                nomeUsuario,
                dataCadastro,
                (String) null,
                nome,
                cpf,
                (List<Apolice>) novaApolice,
                (List<TelefoneCliente>) novoTelefoneCliente,
                (List<EnderecoCliente>) novoEnderecoCliente,
                (List<EmailCliente>) novoEmailCliente);

        // Salva o país usando o serviço
        try {
            clienteService.save(novoCliente);
            System.out.println("País adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar País: " + e.getMessage());
        }
    }









}

