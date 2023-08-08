import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Daftar {
    public static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    public static void myDaftar() {

        List<String> daftarJurusan = new ArrayList<>();
        daftarJurusan.add("Teknologi Informasi");
        daftarJurusan.add("Teknik Mesin");
        daftarJurusan.add("Teknik Kimia");
        daftarJurusan.add("Teknik Elektro");
        daftarJurusan.add("Teknik Sipil");

        Scanner in = new Scanner(System.in);
        boolean selesai = false;
        int noDaftar = getLastNoDaftar();
        String jurusan = null;

        while (!selesai) {
            System.out.println("\nMenu: ");
            System.out.println("1. Daftar Mahasiswa Baru");
            System.out.println("2. Cek Data Pendaftar");
            System.out.println("3. Peringkat Jurusan Calon Mahasiswa");
            System.out.println("4. Kembali Ke Menu Awal");
            System.out.print("Pilihan Anda: ");

            try { // memvalidasi input
                int pilih = in.nextInt();
                in.nextLine();

                if (pilih == 1) {
                    System.out.print("\nMasukkan nama: ");
                    String name = in.nextLine();
                    System.out.print("Masukkan tanggal lahir: ");
                    String tglLahir = in.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = in.nextLine();
                    System.out.print("Masukkan email: ");
                    String email = in.nextLine();
                    System.out.print("Masukkan asal sekolah: ");
                    String sekolah = in.nextLine();

                    while (true) {
                        System.out.print("Masukkan jurusan (cont \"teknik mesin\"): ");
                        jurusan = in.nextLine();

                        if (jurusanValid(jurusan, daftarJurusan)) {
                            break;
                        } else {
                            System.out.println("Jurusan tidak valid, masukkan jurusan yang benar.");
                        }
                    }

                    System.out.print("Masukkan nilai Matematika: ");
                    double mtk = in.nextDouble();
                    System.out.print("Masukkan nilai Bhs Indonesia: ");
                    double bhsIndo = in.nextDouble();
                    System.out.print("Masukkan nilai Bhs Inggris: ");
                    double bhsInggris = in.nextDouble();
                    in.nextLine();

                    double nilaiRapot = (mtk + bhsIndo + bhsInggris) / 3;

                    noDaftar++;

                    // noDaftar adalah key object
                    System.out.println("Terima kasih telah mendaftar, Nomor pendaftaran anda: " + noDaftar);

                    if (jurusanValid(jurusan, daftarJurusan)) {
                        // menyimpan object mahasiswa
                        daftarMahasiswa.add(new Mahasiswa(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan, nilaiRapot));
                        dataPendaftar(daftarMahasiswa); // meyimpan data kedalam file
                    } else {
                        System.out.println("Jurusan tidak valid, silahkan masukkan jurusan yang benar.");
                    }

                } else if (pilih == 2) {
                    System.out.print("\nMasukkan nomor pendaftaran untuk melihat data anda: ");
                    String nomorPendaftaran = in.nextLine();

                    // jurusan
                    boolean cekData = false;
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        if (mahasiswa.getNomorPendaftaran().equals(nomorPendaftaran)) {
                            System.out.println("Data Mahasiswa:");
                            System.out.println("Nomor Pendaftaran: " + mahasiswa.getNoDaftar());
                            System.out.println("Nama: " + mahasiswa.getName());
                            System.out.println("Tanggal Lahir: " + mahasiswa.getTglLahir());
                            System.out.println("Alamat: " + mahasiswa.getAlamat());
                            System.out.println("Email: " + mahasiswa.getEmail());
                            System.out.println("Asal Sekolah: " + mahasiswa.getSekolah());
                            System.out.println("Jurusan Yang Dipilih: " + mahasiswa.getJurusan());
                            System.out.println("Nilai Rata- Rata Rapot: " + mahasiswa.getNilaiRapot());
                            cekData = true;
                            break;
                        }
                    }
                    if (!cekData) {
                        System.out.println("Nomor pendaftaran tidak ditemukan.");
                    }
                } else if (pilih == 3) {
                    System.out.print("Masukkan jurusan yang ingin dilihat: ");
                    String lihatJurusan = in.nextLine();
                    peringkatJurusan(daftarMahasiswa, lihatJurusan);
                } else if (pilih == 4) {
                    MainClass.menu();
                } else {
                    System.out.println("Pilihan Tidak Valid, Silahkan pilih menu yang tersedia.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Pilihan Tidak Valid, Silahkan pilih menu yang tersedia.");
                in.nextLine();
            }
        }
    }

    public static boolean jurusanValid(String jurusan, List<String> daftarJurusan) {
        // memeriksa apakah jurusan sama atau tidak
        for (String validJurusan : daftarJurusan) {
            if (jurusan.equalsIgnoreCase(validJurusan)) {
                return true;
            }
        }
        return false;
    }

    public static void peringkatJurusan(List<Mahasiswa> daftarMahasiswa, String lihatJurusan) {
        Scanner in = new Scanner(System.in);
        // mengurutkan nilai mahasiswa
        List<Mahasiswa> jurusanMahasiswa = new ArrayList<>();

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getJurusan().equalsIgnoreCase(lihatJurusan)) {
                jurusanMahasiswa.add(mahasiswa);
            }
        }

        if (jurusanMahasiswa.isEmpty()) {
            System.out.println("\nJurusan " + lihatJurusan + " tidak valid.");
            return;
        }

        jurusanMahasiswa.sort(Comparator.comparingDouble(Mahasiswa::getNilaiRapot).reversed()); // membandingkan nilai rapot

        System.out.println("\nPeringkat jurusan: " + lihatJurusan);
        for (int i = 0; i < jurusanMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = jurusanMahasiswa.get(i);
            System.out.print((i + 1) + ". " + mahasiswa.getName() + " - Nilai Rapot: " + mahasiswa.getNilaiRapot());

            // cek lulus atau tidak
            if (i < 10) {
                System.out.println(" - Lulus");
            } else {
                System.out.println(" - Tidak lulus");
            }
        }
    }

    public static void dataPendaftar(List<Mahasiswa> daftarMahasiswa){
        // menyimpan data ke dalam file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("dataPendaftar.txt"))){
            for(Mahasiswa mahasiswa : daftarMahasiswa){
                writer.write(mahasiswa.getNoDaftar() + "," + mahasiswa.getName() + "," + mahasiswa.getTglLahir() + ","
                        + mahasiswa.getAlamat() + "," + mahasiswa.getEmail() + "," + mahasiswa.getSekolah() + ","
                        + mahasiswa.getJurusan() + "," + mahasiswa.getNilaiRapot());
                writer.newLine();// pindah baris
            }
        } catch (IOException e) {
            System.out.println("data gagal disimpan");
        }
    }

    public static void readDataPendaftar() {
        // menampilkan kembali data
        daftarMahasiswa = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("dataPendaftar.txt"))) { // membaca file
            String line;
            while ((line = reader.readLine()) != null) { // membaca baris
                String[] data = line.split(","); // baris di pecah dengan array dan tanda "," sebagai pemisah
                int noDaftar = Integer.parseInt(data[0]);
                String name = data[1];
                String tglLahir = data[2];
                String alamat = data[3];
                String email = data[4];
                String sekolah = data[5];
                String jurusan = data[6];
                double nilaiRapot = Double.parseDouble(data[7]);

                daftarMahasiswa.add(new Mahasiswa(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan, nilaiRapot));
            }
        } catch (IOException e) {

        }
    }

    public static int getLastNoDaftar() { // mengambil nomor pendaftaran terakhir
        if (daftarMahasiswa.isEmpty()) {
            return 0; // Jika daftarMahasiswa kosong, mengembalikan nomor pendaftaran awal
        } else {
            // Mengambil nomor pendaftaran terakhir dari daftarMahasiswa
            Mahasiswa lastMahasiswa = daftarMahasiswa.get(daftarMahasiswa.size() - 1);
            return lastMahasiswa.getNoDaftar();
        }
    }
}
