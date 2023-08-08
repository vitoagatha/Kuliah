import java.util.Scanner;

public class Tabungan047 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean tabungan = true;
        int hari = 0;
        int tabung = 0;

        System.out.print("Masukkan nama barang yang ingin kamu beli budi: ");
        String barang = in.next();

        System.out.print("Berapa harganya? ");
        int harga = in.nextInt();

        while (tabungan){
            System.out.print("Masukkan uang yang ingin anda tabung: ");
            tabung = in.nextInt();
            hari++;

            if (tabung >= harga){
                System.out.println("Uang anda cukup");
                tabungan = false;
            } else if (tabung <= harga){
                System.out.println("Uang anda kurang");
            }
        }
        System.out.println("Total tabungan anda: " + tabung + ", anda membutuhkan " + hari + " hari untuk membeli barang tersebut");
    }
}
