package org.example.controlleres;

package org.example.controlleres;

import org.example.models.Country;
import org.example.services.CountryService;

import java.util.Scanner;

public class ClienteController {
    private Scanner scanner;
    private ClienteService clienteService;

    public CountryController() {
        this.scanner = new Scanner(System.in);
        this.countryService = new CountryService();
    }

    public void capturarEMontarCliente() {
        System.out.println("==== Adicionar Novo Cliente ====");

        // Solicita o nome do Cliente
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o Código do CPF: ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.print("Vamos cadastrar o endereco do Cliente: ");



        // Monta o objeto artista
        var novoPais = new Country(
                id, nome);

        // Salva o país usando o serviço
        try {
            countryService.save(novoPais);
            System.out.println("País adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar País: " + e.getMessage());
        }
    }









}

