import supermarket.Products;
import supermarket.cashier.Cashier;
import supermarket.clients.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = true;
        Cashier cashier = new Cashier();

        while(exit) {
            System.out.println("elija una opcion:\n" +
                    "1.- Abrir caja\n" +
                    "2.- Añadir un nuevo cliente a la cola\n" +
                    "3.- Atender al cliente\n" +
                    "4.- Ver clientes pendientes\n" +
                    "5.- Cerrar supermercado");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    if(cashier==null ) {
                        System.out.println("Caja ya abierta");
                    } else {
                        System.out.println("abriendo caja");
                        cashier = new Cashier(1, 0);
                    }
                    break;
                case "2":
                    ArrayList articles = new ArrayList();
                    articles.add(Products.randomProduct());
                    articles.add(Products.randomProduct());
                    articles.add(Products.randomProduct());
                    articles.add(Products.randomProduct());
                    Client client = new Client(Products.randomPerson(), 4, articles );
                    break;
                case "3":
                    System.out.println(3);
                    break;
                case "4":
                    System.out.println(4);
                    break;
                case "5":
                    System.out.println(5);
                    break;
                default:
                    System.out.println(0);
                    break;
            }
        }
    }
}
