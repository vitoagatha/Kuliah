public class expressionStatementBlock {
    public static void main(String[] args) {
        // if else statement
        var nilai = 80;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = nilai >= 75;
        var lulus = lulusNilai && lulusAbsen;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("anda lulus");
        } else {

            System.out.println("silahkan coba lagi");
        }

        if(nilai >= 80 && absen >= 80) {
            System.out.println("nilai anda A");
        }else if (nilai >= 70 && absen >= 70) {
            System.out.println("nilai anda B");
        }else if (nilai >= 60 && absen >= 60) {
            System.out.println("nilai anda C");
        }else if (nilai >= 50 && absen >= 50) {
            System.out.println("nilai anda D");
        }else{
            System.out.println("nilai anda E");


        }
    }
}
