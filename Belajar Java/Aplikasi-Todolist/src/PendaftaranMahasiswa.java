import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PendaftaranMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namaMahasiswa = new ArrayList<>();
        List<Integer> nilaiMahasiswa = new ArrayList<>();
        List<String> jurusanMahasiswa = new ArrayList<>();
        List<String> statusMahasiswa = new ArrayList<>();

        boolean tambahMahasiswa = true;

        while (tambahMahasiswa) {
            System.out.println("\nData Mahasiswa Baru");
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            namaMahasiswa.add(nama);

            System.out.print("Masukkan Nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // Membersihkan new line
            nilaiMahasiswa.add(nilai);

            // Menentukan jurusan dan status kelulusan berdasarkan grading
            String jurusan, status;
            if (nilai >= 80) {
                jurusan = "Informatika";
                status = "Lulus";
            } else if (nilai >= 70) {
                jurusan = "Manajemen";
                status = "Lulus";
            } else if (nilai >= 60) {
                jurusan = "Akuntansi";
                status = "Lulus";
            } else {
                jurusan = "Tidak ada";
                status = "Tidak Lulus";
            }
            jurusanMahasiswa.add(jurusan);
            statusMahasiswa.add(status);

            System.out.print("Tambah Mahasiswa Baru? (y/n): ");
            String tambah = scanner.nextLine();
            if (!tambah.equalsIgnoreCase("y")) {
                tambahMahasiswa = false;
            }
        }

        System.out.print("Masukkan nomor mahasiswa yang ingin dilihat: ");
        int nomorMahasiswa = scanner.nextInt();

        if (nomorMahasiswa >= 1 && nomorMahasiswa <= namaMahasiswa.size()) {
            int index = nomorMahasiswa - 1;

            // Menampilkan data mahasiswa
            System.out.println("\nData Mahasiswa:");
            System.out.println("Nama: " + namaMahasiswa.get(index));
            System.out.println("Nilai: " + nilaiMahasiswa.get(index));
            System.out.println("Jurusan: " + jurusanMahasiswa.get(index));
            System.out.println("Status: " + statusMahasiswa.get(index));
            System.out.println("-----------------------------");
        } else {
            System.out.println("Nomor mahasiswa tidak valid!");
        }
    }
}
