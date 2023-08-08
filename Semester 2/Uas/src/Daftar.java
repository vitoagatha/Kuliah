import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Daftar {

    public static void myDaftar() {
        List<Mahasiswa1> daftarMahasiswa = new ArrayList<>();
        List<String> daftarJurusan = new ArrayList<>();
        daftarJurusan.add("Teknologi Informasi");
        daftarJurusan.add("Teknik Mesin");
        daftarJurusan.add("Teknik Kimia");
        daftarJurusan.add("Teknik Elektro");
        daftarJurusan.add("Teknik Sipil");

        Scanner in = new Scanner(System.in);
        boolean selesai = false;
        int noDaftar = 100;
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
                        daftarMahasiswa.add(new Mahasiswa1(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan, nilaiRapot));
                    } else {
                        System.out.println("Jurusan tidak valid, silahkan masukkan jurusan yang benar.");
                    }

                } else if (pilih == 2) {
                    System.out.print("\nMasukkan nomor pendaftaran untuk melihat data anda: ");
                    String nomorPendaftaran = in.nextLine();

                    // jurusan
                    boolean cekData = false;
                    for (Mahasiswa1 mahasiswa1 : daftarMahasiswa) {
                        if (mahasiswa1.getNomorPendaftaran().equals(nomorPendaftaran)) {
                            System.out.println("Data Mahasiswa:");
                            System.out.println("Nomor Pendaftaran: " + mahasiswa1.getNoDaftar());
                            System.out.println("Nama: " + mahasiswa1.getName());
                            System.out.println("Tanggal Lahir: " + mahasiswa1.getTglLahir());
                            System.out.println("Alamat: " + mahasiswa1.getAlamat());
                            System.out.println("Email: " + mahasiswa1.getEmail());
                            System.out.println("Asal Sekolah: " + mahasiswa1.getSekolah());
                            System.out.println("Jurusan Yang Dipilih: " + mahasiswa1.getJurusan());
                            System.out.println("Nilai Rata- Rata Rapot: " + mahasiswa1.getNilaiRapot());
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

    private static boolean jurusanValid(String jurusan, List<String> daftarJurusan) {
        // memeriksa apakah jurusan sama atau tidak
        for (String validJurusan : daftarJurusan) {
            if (jurusan.equalsIgnoreCase(validJurusan)) {
                return true;
            }
        }
        return false;
    }

    public static void peringkatJurusan(List<Mahasiswa1> daftarMahasiswa, String lihatJurusan) {
        Scanner in = new Scanner(System.in);
        // mengurutkan nilai mahasiswa
        List<Mahasiswa1> jurusanMahasiswa = new ArrayList<>();

        for (Mahasiswa1 mahasiswa1 : daftarMahasiswa) {
            if (mahasiswa1.getJurusan().equalsIgnoreCase(lihatJurusan)) {
                jurusanMahasiswa.add(mahasiswa1);
            }
        }

        if (jurusanMahasiswa.isEmpty()) {
            System.out.println("\nJurusan " + lihatJurusan + " tidak valid.");
            return;
        }

        jurusanMahasiswa.sort(Comparator.comparingDouble(Mahasiswa1::getNilaiRapot).reversed()); // membandingkan nilai rapot

        System.out.println("\nPeringkat jurusan: " + lihatJurusan);
        for (int i = 0; i < jurusanMahasiswa.size(); i++) {
            Mahasiswa1 mahasiswa1 = jurusanMahasiswa.get(i);
            System.out.print((i + 1) + ". " + mahasiswa1.getName() + " - Nilai Rapot: " + mahasiswa1.getNilaiRapot());

            // cek lulus atau tidak
            if (i < 10) {
                System.out.println(" - Lulus");
            } else {
                System.out.println(" - Tidak lulus");
            }
        }
    }
}