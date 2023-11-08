public class ProgramTanggal {
    public static void main(String[] args) {
        Tanggal hariIni = new Tanggal();
        hariIni.print();

        Tanggal kemarin = new Tanggal(19, 9, 2023);
        kemarin.print();

        Tanggal besok = new Tanggal(21, 9, 2023);
        besok.print();

        Tanggal lusa = new Tanggal(25, 2, 2023);
        lusa.print();

        System.out.println("Jumlah hari dalam bulan ini: " + hariIni.hari(hariIni.bulan, hariIni.tahun));

        int selish = kemarin.selisihHari(besok);
        System.out.println("Selisih hari antar kemarin dam besok: " + selish + " hari");

        Tanggal setelahLusa = lusa.tambahHari(5);
        System.out.print("Tanggal setelah 5 hair dari lusa: ");
        setelahLusa.print();
    }
}

class Tanggal{
    int tanggal;
    int bulan;
    int tahun;

    Tanggal(){ // constructor default
        tanggal = 20;
        bulan = 9;
        tahun = 2023;
    }

    Tanggal(int tanggal, int bulan, int tahun){ // constructor 2
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    void print(){
        System.out.printf(
                "%d-%d-%d\n",
                tanggal, bulan, tahun);
    }

    int hari(int bulan, int tahun){
        int[] jumlahHari = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (bulan == 2 && tahunKabisat(tahun)){
            return 29; // taun kabisat 29 hari
        } else {
            return jumlahHari[bulan]; // tahun non kabisat
        }
    }

    int selisihHari(Tanggal lain){
        int jumlahHari1 = tahun * 365 + bulan * 30 + tanggal;
        int jumlahHari2 = lain.tahun * 365 + lain.bulan * 30 + lain.tanggal;
        return Math.abs(jumlahHari1 - jumlahHari2);
    }

    Tanggal tambahHari(int hari){
        Tanggal hasil = new Tanggal(tanggal, bulan, tahun); // menyalin tanggal saat ini
        hasil.tanggal += hari; // tambah jumlah hari

        while(hasil.tanggal > hari(hasil.bulan, hasil.tahun)){
            hasil.tanggal -= hari(hasil.bulan, hasil.tahun);
            hasil.bulan++; // pindah ke bulan selanjutnya

            if(hasil.bulan > 12){
                hasil.bulan = 1; // kembali ke januari
                hasil.tahun++; // tambah tahun
            }
        }
        return hasil;
    }

    boolean tahunKabisat(int tahun){ // hitung thaun kabisat
        return (tahun % 400 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }
}