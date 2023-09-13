public class IntroClass {
    public static void main(String[] args) {
        Murid budi = new Murid();
        budi.nim = 123;
        budi.name = "Budi Tabudy";
        
        System.out.println(budi.name);
        System.out.println(budi.nim);
    }
}

class Murid{
    int nim;
    String name;
}