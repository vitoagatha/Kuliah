import java.util.Arrays;
import java.util.Scanner;

public class NamaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] mahasiswa = new String[10];
        int n = 0;

        while (true){
            System.out.print("Masukkan mahasiswa ke " + (n + 1) + ": atau - untuk berhenti: ");
            String mhs = in.nextLine();


            if ("-".equals(mhs)){
                break;
            }

            mahasiswa[n] = mhs;
            n++;

            if (n == mahasiswa.length){
                // System.out.println("Array penuh. Lanjutkan lagi nanti di transaksi berikutnya.");
                //break;

                mahasiswa = Arrays.copyOf(mahasiswa , mahasiswa.length * 2);
            }
        }

        System.out.println(n + " mahasiswa berhasil disimpan.");
        System.out.println("Berikut data mahasiswa: ");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + mahasiswa[i]);
        }
    }
}
