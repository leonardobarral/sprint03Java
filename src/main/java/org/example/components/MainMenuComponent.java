package org.example.components;

import org.example.controlleres.ClienteController;

import java.util.Scanner;

public class MainMenuComponent {

    private ClienteController clienteController;
    private Scanner scanner;

    public MainMenuComponent() {
        this.clienteController = new ClienteController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("==== Menu Principal ====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcao) {
                case 1:
                    clienteController.capturarEMontarCliente();
                    break;
                case 2:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
