package supermarket.cashier;
import java.util.ArrayList;

public class Cashier {
    private int cashierNumber;
    public int totalClients;
    public ArrayList clients = new ArrayList();

    public Cashier(int cashierNumber, int totalClients) {
        this.cashierNumber = cashierNumber;
        this.totalClients = totalClients;
    }

    public Cashier() {
    }

    @Override
    public String toString() {
        if (this.clients.size() < 2) {
            return "===================================\n" +
                    "* Número de caja: <" + this.cashierNumber + ">:\n" +
                    "* Total de clientes: <" + this.totalClients + ">\n" +
                    "* Clientes en la fila:\n" +
                    "<" + this.clients.get(0) + ">\n" +
                    "===================================";
        }
        return "===================================\n" +
                "* Número de caja: <" + this.cashierNumber + ">:\n" +
                "* Total de clientes: <" + this.totalClients + ">\n" +
                "* Clientes en la fila:\n" +
                "<" + this.clients.get(0) + ">\n" +
                "<" + this.clients.get(1) + ">\n" +
                "===================================";
    }
}
