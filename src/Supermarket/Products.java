package Supermarket;

public class Products {
    private static String aviableProducts[] = {"manzana", "tomate", "leche", "cereales", "pan", "lejia", "limpiacristales", "atun", "aceite", "cerveza", "huevos", "refrescos", "azucar", "harina"};
    private static String people[] = {"Juan", "Carlos", "Diego", "Pedro", "Carmen", "Paola", "Paula", "Ramiro", "Alvaro", "Gwyn", "Anri", "Solaire", "Nito", "Isalith", "Gwyndolin", "Artorias", "Sith", "Siegward", "Crisanta", "Catalina"};

    public static String randomProduct() {
        return aviableProducts[(int)Math.floor(Math.random()*14)];
    }

    public static String randomPerson() {
        return people[(int)Math.floor(Math.random()*20)];
    }
}
