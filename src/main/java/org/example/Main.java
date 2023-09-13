package org.example;
import org.example.infraestructure.OracleDatabaseSetup;
import org.example.components.MainMenuComponent;
public class Main {
    public static void main(String[] args) {
        OracleDatabaseSetup setup = new OracleDatabaseSetup();
        setup.createTables();
        MainMenuComponent menu = new MainMenuComponent();
        menu.exibirMenu();
    }
}