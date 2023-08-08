public class Method {
    public static void main(String[] args) {

        sayHelloWorld();
        // ini parameter
        sayHello("jamal", "budi");
    }

    static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    // ini parameter
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
