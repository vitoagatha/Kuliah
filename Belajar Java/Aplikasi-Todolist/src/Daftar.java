import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Daftar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> emailMahasiswa = new ArrayList<>();
        List<String> namaMahasiswa = new ArrayList<>();
        List<String> alamatMahasiswa = new ArrayList<>();
        List<String> prodiMahasiswa = new ArrayList<>();

        boolean tambahMahasiswa = true;
        int noReg = 0;

        while (tambahMahasiswa){
            System.out.println("Masukkan data diri anda: ");
            System.out.print("Maukkan email: ");
            String email = in.nextLine();
            emailMahasiswa.add(email); // tambah email
            noReg++; // no urutan daftar

            System.out.print("Masukkan nama: ");
            String nama = in.nextLine();
            namaMahasiswa.add(nama);

            System.out.print("Masukkan Alamat: ");
            String alamat = in.nextLine();
            alamatMahasiswa.add(alamat);

            System.out.print("Pilih Prodi: ");
            String prodi = in.nextLine();
            if (prodi.equalsIgnoreCase("1")){
                System.out.println("Teknologi informasi");
            } else if (prodi.equalsIgnoreCase("2")){
                System.out.println("Teknik sipil");
            }

            prodiMahasiswa.add(prodi);

            System.out.print("Sudah?: ");
            String pl = in.nextLine();
            if (pl.equalsIgnoreCase("y")){
                tambahMahasiswa = false;
            }
        }

        System.out.print("Masukkan No Regristasi untuk melihat data mahasiswa: ");
        int nomorMahasiswa = in.nextInt();
        in.nextLine();
        if (nomorMahasiswa >= 1 && nomorMahasiswa <= emailMahasiswa.size()){
            int index = nomorMahasiswa -1;

            System.out.println("email: " + emailMahasiswa.get(index)); // get untuk memanggil
            System.out.println("nama: " + namaMahasiswa.get(index));
            System.out.println("alamat: " + alamatMahasiswa.get(index));
            System.out.println("prodi: " + prodiMahasiswa.get(index));
        }
    }
}
