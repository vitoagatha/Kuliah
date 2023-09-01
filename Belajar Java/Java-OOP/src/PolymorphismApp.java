class PolymorphismApp { // pewarisan atau merubah bentuk objek1 ke objek lainnya
    public static void main(String[] args) {

        Employee employee = new Employee("Joko");
        employee.sayHello("Budi");

        employee = new Manager("Joko");
        employee.sayHello("Budi");

        employee = new VicePresident("Joko");
        employee.sayHello("Budi");

        // method Polymorphism
        sayHello(new Employee("Joko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Joko"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
