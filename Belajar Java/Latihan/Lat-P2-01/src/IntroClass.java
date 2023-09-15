public class IntroClass {
    public static void main(String[] args) {
        Murid budi = new Murid();

        budi.nama = "Budi Tabudy";
        budi.nim = 123;
        budi.nilai = 85;

        System.out.println("Nama: " + budi.nama);
        System.out.println("Nilai: " + budi.nilai);
        System.out.println("Nim: " + budi.nim);
    }
}

class Murid {
    String nama;
    int nim;
    int nilai;
}