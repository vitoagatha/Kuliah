package belajar.java.application;

import belajar.java.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        System.out.println(category.getId()); // method get / getter unutuk mengambil data
        System.out.println(category.isExpensive()); // is untuk type boolean

        category.setId(null); // setter untuk mengganti data
        
    }
}
