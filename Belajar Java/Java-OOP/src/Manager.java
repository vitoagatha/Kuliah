class Manager { // class parent

    String name;

    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}

// inheritance atau pewarisan
class VicePresident extends Manager{ // class child
    void sayHello(String name){ // method overriding, method di class manager tidak bisa di gunakan
        System.out.println("Hi " + name + ", My name is VP " + this.name); // karna sama / dideklarasi ulang
    }
}
