public class Tanggal047 {

    public static String namaBulan(int bulan){
        String result;
        switch (bulan){
            case 1:
                result = "Januari";
                break;
            case 2:
                result = "Februari";
                break;
            case 3:
                result = "Maret";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "Mei";
                break;
            case 6:
                result = "Juni";
                break;
            case 7:
                result = "Juli";
                break;
            case 8:
                result = "Agustus";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "Oktober";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "Desember";
                break;
            default:
                result = "Error";
                break;
        }
        return result;
    }

    public static void printTanggal(int tanggal, int bulan, int tahun){
        System.out.println(tanggal + " " + namaBulan(bulan) + " " + tahun);
    }

    public static void main(String[] args) {
        printTanggal(23, 2, 2022);
        printTanggal(1, 6, 1992);
        printTanggal(31, 8, 1970);
    }
}
