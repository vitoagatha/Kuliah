public class PersonTest {
    public static void main(String[] args) {
        
        // membuat objek
        Person person1 = new Person();
        person1.name = "Dimas";
        person1.age = 27;

        Person person2 = new Person();
        person2.name = "Siti";
        person2.age = 25;

        // memanggil method walk() dari objek person1
        person1.walk();

        // memanggil method marry() untuk menghubungkan person1 dan person2 
        person1.marry(person2);

        System.out.println(person1.name + " is married to " + person1.spouse.name);
    }
}
