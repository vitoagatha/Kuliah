class Person{

    String name;
    int age;
    Person spouse;

    void walk(){
        System.out.println(name + " walks");
    }

    void marry (Person fiancee){
        spouse = fiancee;
    }
}