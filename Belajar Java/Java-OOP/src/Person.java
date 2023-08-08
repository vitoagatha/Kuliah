class Person {
    String name; // ini field / property / atribut untuk object
    String address;
    final String country = "Indonesia"; // final variable = variable yang tidak bisa diubah

    Person(String paramName, String paramAddress){ // ini constructor, mirip seperti method, dijalankna lebih dulu
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName){ // ini constructor overloading / lebih dari satu
        this(paramName, null); // memenaggil constructor lain
    } // this.name untuk mengatasi variable shadowing

    Person(){ // constructor overloading

    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
