import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;


public class Coba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // object hashmap untuk menyimpan data
        HashMap<String, List<Mahasiswa>> daftarMahasiswa = new HashMap<>();
        List<String> daftarJurusan = new ArrayList<>();
        daftarJurusan.add("Teknologi Informasi"); // Menambah jurusan
        daftarJurusan.add("teknik Mesin");
        daftarJurusan.add("Teknik Kimia");
        daftarJurusan.add("Teknik Elektro");
        daftarJurusan.add("Teknik Sipil");

        boolean selesai = false;
        int noDaftar = 100;

        while (!selesai){
            System.out.println("\nMenu: ");
            System.out.println("1. Daftar Mahasiswa Baru");
            System.out.println("2. Cek Data Pendaftar");
            System.out.println("3. Kembali Ke Menu Awal");
            System.out.print("Pilihan Anda: ");

            try { // untuk memvalidasi input
                int pilih = in.nextInt();
                in.nextLine();

                switch (pilih){
                    case 1 :
                        System.out.print("Masukkan nama: ");
                        String name = in.nextLine();
                        System.out.print("Masukkan tanggal lahir: ");
                        String tglLahir = in.nextLine();
                        System.out.print("Masukkan alamat: ");
                        String alamat = in.nextLine();
                        System.out.print("Masukkan email: ");
                        String email = in.nextLine();
                        System.out.print("Masukkan asal sekolah: ");
                        String sekolah = in.nextLine();
                        System.out.print("Masukkan Nama jurusan: ");
                        String jurusan = in.nextLine();
                        noDaftar++;

                        if (daftarJurusan.contains(jurusan)){ // mencocokkan jurusan
                            // menyimpan object berdasarkan jurusan
                            if (daftarMahasiswa.containsKey(jurusan)){
                               List<Mahasiswa> mahasiswaList = daftarMahasiswa.get(jurusan);
                               Mahasiswa mahasiswa = new Mahasiswa(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan);
                               mahasiswaList.add(mahasiswa);
                            } else {
                                List<Mahasiswa> mahasiswaList = new ArrayList<>();
                                Mahasiswa mahasiswa = new Mahasiswa(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan);
                                mahasiswaList.add(mahasiswa);
                                daftarMahasiswa.put(jurusan, mahasiswaList);
                            }

                        }

                        System.out.println("Terima kasih telah mendaftar, Nomor pendaftaran anda: " + noDaftar);// ini adalah key object

                        //menyimpan object mahasiswa ke hashmap
                        daftarMahasiswa.put(String.valueOf(noDaftar), new ArrayList<>());
                        daftarMahasiswa.get(String.valueOf(noDaftar)).add(new Mahasiswa(noDaftar, name, tglLahir, alamat, email, sekolah, jurusan));// mengambil data
                        break;

                    case 2 :
                        System.out.print("\nMasukkan nomor pendaftaran untuk melihat data anda: ");
                        String nomorPendaftaran = in.nextLine();
                        // ini object mahasiswa

                        if (daftarMahasiswa.containsKey(nomorPendaftaran)) {
                            List<Mahasiswa> mahasiswaList = daftarMahasiswa.get(nomorPendaftaran);
                            for (Mahasiswa mahasiswa : mahasiswaList){
                                System.out.println("Data Mahasiswa:");
                                System.out.println("Nomor Pendaftaran: " + mahasiswa.getNoDaftar());
                                System.out.println("Nama: " + mahasiswa.getName());
                                System.out.println("Tanggal Lahir: " + mahasiswa.getTglLahir());
                                System.out.println("Alamat: " + mahasiswa.getAlamat());
                                System.out.println("Email: " + mahasiswa.getEmail());
                                System.out.println("Asal Sekolah: " + mahasiswa.getSekolah());
                                System.out.println("Jurusan Yang Dipilih: " + mahasiswa.getJurusan());
                            }
                        } else {
                            System.out.println("Nomor pendaftaran tidak ditemukan.");
                        }
                        break;

                    case 3 :
                        // method ke menu awal

                    default:
                        System.out.println("Pilihan Tidak Valid, Silahkan pilih menu yang tersedia.");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Pilihan Tidak Valid, Silahkan pilih menu yang tersedia.");
                in.nextLine();
            }
        }
    }
}

class Mahasiswa{
    private String noDaftar;
    private String name;
    private String tglLahir;
    private String alamat;
    private String email;
    private String sekolah;

    private String jurusan;

    public Mahasiswa(int noDaftar, String name, String tglLahir, String alamat, String email, String sekolah, String jurusan){ // ini constructor
        this.noDaftar = String.valueOf(noDaftar);
        this.name = name; // mengambil nilai name
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.email = email;
        this.sekolah = sekolah;
        this.jurusan = jurusan;
    }

    public String  getNoDaftar(){
        return noDaftar;
    }

    // mengembalikan name
    public String getName(){
        return name;
    }

    public String getTglLahir(){
        return tglLahir;
    }

    public String getAlamat(){
        return alamat;
    }
    public String getEmail() {
        return email;
    }

    public String getSekolah() {
        return sekolah;
    }

    public String getJurusan() {
        return jurusan;
    }
}
