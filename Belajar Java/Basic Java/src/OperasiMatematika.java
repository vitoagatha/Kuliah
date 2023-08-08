public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int c = 100;
        // augmented assigment
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        // unary operation

        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        // operasi perbandingan

        int value1 = 100;
        int value2 = 100;

        System.out.println(value1 > value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);

        // operation boolean and(&&), or(||), not(!)

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 70;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
