package belajar.java.application;

import belajar.java.data.Animal;
import belajar.java.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();

    }
}
