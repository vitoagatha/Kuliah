public class NestingLoops {
    public static void main( String[] args ) {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ ) {
            for ( char c ='A'; c <= 'E'; c++ ) {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ ) {
            for ( int b=1; b <= 3; b++ ) {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();// * You will add a line of code here.
        }

        System.out.println("\n");
        // 1. Variable yang berubah lebih cepat adalah n,di kendalikan loop dalam yaitu n
        // 2. Output berubah menampilkan setiap nilai n muncul 5 kali sesuai loop dalam yaitu c
        // 3. Output yang keluar vertikal atau urut ke bawah
        // 4. Output menjadi 3 baris dan 3 kolom
    }
}