package Supermarket;

public class Products {
    private static String aviableProducts[] = {"manzana", "tomate", "leche", "cereales", "pan", "lejia", "limpiacristales", "atun", "aceite", "cerveza", "huevos", "refrescos", "azucar", "harina"};


    public String randomProduct() {
        return aviableProducts[(int)Math.floor(Math.random()*14)];
    }

}
