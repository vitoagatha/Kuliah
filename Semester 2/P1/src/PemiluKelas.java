import java.util.Scanner;
public class PemiluKelas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihAni = 0;
        int pilihBudi = 0;

        System.out.print("Masukkan banyak siswa: ");
        int banyakSiswa = input.nextInt();

        for (int i = 1; i <= banyakSiswa; i++){
            System.out.print("Siswa " + i + " memilih siapa? ");
            String pilihan = input.next();

            while (!pilihan.equalsIgnoreCase("ani")
                    && !pilihan.equalsIgnoreCase("Budi")
            ){
                System.out.println("Pilihan tidak valid!");
                System.out.print("Pilih Ani/Budi: ");
                pilihan = input.next();
            }
            if (pilihan.equalsIgnoreCase("Ani")){
                pilihAni++;
            } else if (pilihan.equalsIgnoreCase("Budi")){
                pilihBudi++;
            }
        }
        String pemenang = "-";
        if (pilihAni > pilihBudi){
            pemenang = "Ani";
        } else if (pilihAni < pilihBudi){
            pemenang = "Budi";
        }
        System.out.println("Ani = " + pilihAni);
        System.out.println("Budi = " + pilihBudi);
        System.out.println("Pemenang = " + pemenang);
    }
}
