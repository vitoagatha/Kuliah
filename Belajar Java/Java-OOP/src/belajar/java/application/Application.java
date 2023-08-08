package belajar.java.application;

import belajar.java.data.Product; // * untuk mengimport semua class

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Mac Book", 20_000_000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
