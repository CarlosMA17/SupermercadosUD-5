package supermarket.cashier;
import supermarket.clients.Client;

import java.util.Arrays;

public class Cashier {
    private int cashierNumber;
    private int totalClients;
    private Client[] clients;

    @Override
    public String toString() {
        return "===================================\n" +
                "* Número de caja: <" + this.cashierNumber + ">:\n" +
                "* Total de clientes: <" + this.totalClients + ">\n" +
                "* Clientes en la fila:\n" +
                "<" + this.clients[0].getName() + ">\n" +
                "<" + this.clients[1].getName() + ">\n" +
                "===================================";
    }
}
