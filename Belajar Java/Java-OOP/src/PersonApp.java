public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Mac", "Jombang"); // ini object
        // person1.name = "Mac Alister"; manipulasi field atau mengubah isi field
        // person1.address = "Argentina";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("James"); // memanggil method

        Person person2 = new Person("Joko");

        Person person3;
        person3 = new Person();
        person3.name = "Widodo";
        person3.sayHello("Jawir");

    }
}
