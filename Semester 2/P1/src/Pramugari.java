import java.util.Scanner;
public class Pramugari {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia anda: ");
        int usia = input.nextInt();

        System.out.print("Masukkan tinggi badan anda: ");
        int tinggi = input.nextInt();

        // usia antara 18-27 tahun
        // tinggi badan antara 158-172

        boolean usiaOk = 18 <= usia && usia <= 27;
        boolean tinggiOk = 158 <= tinggi && tinggi <= 172;

        if (usiaOk && tinggiOk){
            System.out.println("Memenuhi kedua syarat");
        } else if (usiaOk){
            System.out.println("Memenuhi syarat usia, namun tidak memenuhi syarat tinggi");
        } else if (tinggiOk){
            System.out.println("Memenuhi syarat tinggi, namun tidak memenuhi syarat usia");
        } else{
            System.out.println("Tidak memenuhi kedua syarat");
        }
    }
}
