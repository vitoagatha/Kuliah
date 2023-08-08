import java.util.Scanner;
public class Tabung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari jari alas tabung: ");
        double radius = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        double volume = hitungVolumeTabung(radius, tinggi);
        System.out.println("Volume tabung = " + volume);
    }
    public static double hitungVolumeTabung(double radius, double tinggi){
        double luasAlas = hitungLuasLingkaran(radius);
        double volume = luasAlas * tinggi;
        return volume;
    }
    public static double hitungLuasLingkaran(double radius){
        double luas = Math.PI * radius * radius;
        return luas;
    }
}
