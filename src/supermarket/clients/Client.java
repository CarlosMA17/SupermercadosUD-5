package supermarket.clients;

import java.util.ArrayList;
public class Client {
    private String name;
    private int totalProducts;
    private ArrayList articles;

    public Client(String name, int totalProducts, ArrayList articles) {
        this.name = name;
        this.totalProducts = totalProducts;
        this.articles = articles;
    }

    public String getName() {
        return name;
    }

    public String mainToString() {
        return "===================================\n" +
                "* Nombre: <" + this.getName() + ">\n" +
                "* Total de productos: <" + this.totalProducts + ">\n" +
                "* Lista de artículos en la cesta:\n" +
                "<" + this.articles.get(0) + ">\n" +
                "<" + this.articles.get(1) + ">\n" +
                "===================================";
    }

    @Override
    public String toString() {
        return "===================================\n" +
                "* Nombre: <" + this.getName();
    }
}
