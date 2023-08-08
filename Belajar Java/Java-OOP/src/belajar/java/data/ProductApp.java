package belajar.java.data;

import belajar.java.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac book", 20_000_000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
