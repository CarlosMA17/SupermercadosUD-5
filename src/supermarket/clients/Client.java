package supermarket.clients;

import java.util.Arrays;

public class Client {
    private String name;
    private int totalProducts;
    private String[] articles;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "===================================\n" +
                "* Nombre: <" + this.getName() + ">\n" +
                "* Total de productos: <" + this.totalProducts + ">\n" +
                "* Lista de artículos en la cesta:\n" +
                "<" + this.articles[0] + ">\n" +
                "<" + this.articles[1] + ">\n" +
                "===================================";
    }
}
