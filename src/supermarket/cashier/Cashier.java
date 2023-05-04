package supermarket.cashier;
import supermarket.clients.Client;


public class Cashier {
    public int cashierNumber;
    private int totalClients;
    private Client[] clients;

    public Cashier(int cashierNumber, int totalClients) {
        this.cashierNumber = cashierNumber;
        this.totalClients = totalClients;
    }

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
