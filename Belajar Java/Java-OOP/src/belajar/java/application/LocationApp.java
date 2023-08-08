package belajar.java.application;

import belajar.java.data.City;

public class LocationApp {
    public static void main(String[] args) {

        // var location = new Location(); error karena abstract
        var city = new City();
        city.name = "Gresik";

        System.out.println(city.name);
    }
}
