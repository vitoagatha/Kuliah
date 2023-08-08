public class Mahasiswa {
    private int noDaftar; //seperti variable instan
    private String nomorPendaftaran;
    private String name;
    private String tglLahir;
    private String alamat;
    private String email;
    private String sekolah;
    private String jurusan;
    private double nilaiRapot;

    // ini constructor
    public Mahasiswa(int noDaftar, String name, String tglLahir, String alamat, String email, String sekolah, String jurusan, Double nilaiRapot){
        // menginisialilasi variable
        this.noDaftar = noDaftar;
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
    public int getNoDaftar(){
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
