import supermarket.Products;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = true;

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
                    System.out.println(1);
                    break;
                case "2":
                    System.out.println(2);
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
