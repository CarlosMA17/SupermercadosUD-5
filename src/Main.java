import supermarket.Products;
import supermarket.cashier.Cashier;
import supermarket.clients.Client;

import java.util.ArrayList;
import java.util.Random;
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
                    if(cashier.cashierNumber==1 ) {
                        System.out.println("Caja ya abierta");
                    } else {
                        System.out.println("abriendo caja");
                        cashier = new Cashier(1, 0);
                    }
                    break;
                case "2":
                    ArrayList articles = new ArrayList();
                    int numberOfProducts = (int)(Math. random()*10+1); ;
                    for (int i = 0; i < numberOfProducts; i++) {
                        articles.add(Products.randomProduct());
                    }
                    Client client = new Client(Products.randomPerson(), numberOfProducts, articles );
                    if(cashier.cashierNumber==1 ) {
                        cashier.totalClients++;
                        cashier.clients.add(client);
                        System.out.println(client.mainToString());
                    } else {
                        System.out.println("la caja esta cerrada");
                    }

                    break;
                case "3":
                    if (cashier.totalClients != 0) {
                        System.out.println("se ha atendido al cliente " + cashier.clients.get(0));
                        cashier.clients.remove(0);
                        cashier.totalClients--;
                    } else {
                        System.out.println("no hay clientes que atender");
                    }
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
