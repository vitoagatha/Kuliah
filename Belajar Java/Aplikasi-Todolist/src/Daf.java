import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Comparator;

public class Daf {
    public static void main(String[] args) {

        myDfatar();

    }

    public static void myDfatar(){
        HashMap<String, List<Mahasiswa1>> daftarMahasiswa = new HashMap<>();
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

        while (!selesai){
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

                    while (true){
                        System.out.print("Masukkan jurusan (cont \"teknik mesin\"): ");
                        jurusan = in.nextLine();

                        if (jurusanValid(jurusan, daftarJurusan)){
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
                        // menyimpan object mahasiswa berdasarkan jurusan
                        if (daftarMahasiswa.containsKey(jurusan)) {
                            List<Mahasiswa1> mahasiswa1List = daftarMahasiswa.get(jurusan);
                            mahasiswa1List.add(new Mahasiswa1(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan, nilaiRapot));
                        } else { // jika jurusan tidak ada maka akan buat list baru
                            List<Mahasiswa1> mahasiswa1List = new ArrayList<>();
                            mahasiswa1List.add(new Mahasiswa1(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan, nilaiRapot));
                            daftarMahasiswa.put(jurusan, mahasiswa1List);
                        }
                    } else {
                        System.out.println("Jurusan tidak valid, silahkan masukkan jurusan yang benar.");
                    }

                } else if (pilih == 2) {
                    System.out.print("\nMasukkan nomor pendaftaran untuk melihat data anda: ");
                    String nomorPendaftaran = in.nextLine();

                    // jurusan
                    boolean cekData = false;
                    for (List<Mahasiswa1> mahasiswa1List : daftarMahasiswa.values()) { // mengembalikan nilai
                        Mahasiswa1 mahasiswa1 = getMahasiswaByNomorPendaftaran(mahasiswa1List, nomorPendaftaran);

                        if (mahasiswa1 != null) {
                            System.out.println("Data Mahasiswa:");
                            System.out.println("Nomor Pendaftaran: " + mahasiswa1.getNoDaftar());
                            System.out.println("Nama: " + mahasiswa1.getName());
                            System.out.println("Tanggal Lahir: " + mahasiswa1.getTglLahir());
                            System.out.println("Alamat: " + mahasiswa1.getAlamat());
                            System.out.println("Email: " + mahasiswa1.getEmail());
                            System.out.println("Asal Sekolah: " + mahasiswa1.getSekolah());
                            System.out.println("Jurusan Yang Dipilih: " + mahasiswa1.getJurusan());
                            cekData = true;
                        }
                    }
                    if (!cekData){
                        System.out.println("Nomor pendaftaran tidak ditemukan.");
                    }
                } else if (pilih == 3) {
                    System.out.print("Masukkan jurusan yang ingin dilihat: ");
                    String lihatJurusan = in.nextLine();
                    peringkatJurusan(daftarMahasiswa, lihatJurusan);
                } else if (pilih == 4) {
                    // kembali ke menu awal
                    System.out.println("Hola");
                } else {
                    System.out.println("Pilihan Tidak Valid, Silahkan pilih menu yang tersedia.");
                }

            } catch (InputMismatchException e){
                System.out.println("Pilihan Tidak Valid, Silahkan pilih menu yang tersedia.");
                in.nextLine();
            }
        }
    }

    private static boolean jurusanValid(String jurusan, List<String> daftarJurusan){
        // memeriksa apakah jurusan sama atau tidak
        for (String ValidJurusan : daftarJurusan){
            if (jurusan.equalsIgnoreCase(ValidJurusan)){
                return true;
            }
        }
        return false;
    }

    private static Mahasiswa1 getMahasiswaByNomorPendaftaran(List<Mahasiswa1> mahasiswa1List, String nomorPendaftaran){
        // mencari object mahasiswa berdasarkan no pendaftaran
        for (Mahasiswa1 mahasiswa1 : mahasiswa1List){
            if (mahasiswa1.getNomorPendaftaran().equals(nomorPendaftaran)){
                return mahasiswa1;
            }
        }
        return null;
    }

    public static void peringkatJurusan(Map<String, List<Mahasiswa1>> daftarMahasiswa, String lihatJurusan){
        Scanner in = new Scanner(System.in);
        // mengurutkan nilai mahasiswa
        while (!daftarMahasiswa.containsKey(lihatJurusan)){
            System.out.println("/nJurusan " + lihatJurusan + " tidak valid.");
            System.out.print("Masukkan jurusan yang ingin dilihat: ");
            lihatJurusan = in.nextLine();
        }

        if (daftarMahasiswa.containsKey(lihatJurusan)){
            List<Mahasiswa1> mahasiswa1List = daftarMahasiswa.get(lihatJurusan);
            mahasiswa1List.sort(Comparator.comparingDouble(Mahasiswa1::getNilaiRapot).reversed()); // membandingkan nilai rapot

            System.out.println("\nPeringkat jurusan: " + lihatJurusan);
            for (int i = 0; i < mahasiswa1List.size(); i++) {
                Mahasiswa1 mahasiswa1 = mahasiswa1List.get(i);
                System.out.println((i + 1) + ". " + mahasiswa1.getName() + " - Nilai Rapot: " + mahasiswa1.getNilaiRapot());

                // cek lulus atau tidak
                if (i < 10){
                    System.out.println(" - Lulus");
                } else {
                    System.out.println(" - Tidak lulus");
                }
            }
        }
    }

}


class Mahasiswa1{
    private String noDaftar;
    private String nomorPendaftaran;
    private String name;
    private String tglLahir;
    private String alamat;
    private String email;
    private String sekolah;
    private String jurusan;
    private double nilaiRapot;

    // ini constructor
    public Mahasiswa1(int noDaftar, String name, String tglLahir, String alamat, String email, String sekolah, String jurusan, Double nilaiRapot){
        // menginisialilasi variable
        this.noDaftar = String.valueOf(noDaftar); //seperti variable instan
        this.nomorPendaftaran = String.valueOf(noDaftar);
        this.name = name;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.email = email;
        this.sekolah = sekolah;
        this.jurusan = jurusan;
        this.nilaiRapot = nilaiRapot;
    }

    // mengembalikan nilai
    public String getNoDaftar(){
        return noDaftar;
    }

    public String getNomorPendaftaran(){
        return nomorPendaftaran;
    }

    public String getName(){
        return name;
    }

    public String getTglLahir(){
        return tglLahir;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getEmail(){
        return email;
    }

    public String getSekolah(){
        return sekolah;
    }

    public String getJurusan(){
        return jurusan;
    }

    public double getNilaiRapot(){
        return nilaiRapot;
    }
}
