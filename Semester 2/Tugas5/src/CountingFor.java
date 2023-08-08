import java.util.Scanner;
public class CountingFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = input.nextLine();

        for ( int n = 1 ; n <= 10 ; n++ ) {
            if (n % 2 == 0) {
                System.out.println(n + ". " + message);
            }
        }
        // 1. untuk menambahakan nilai n, output yang keluar nomor 1 dan tidak berhenti
        // 2. untuk menyimpan nilai awal for, eror karna tidak ada variable n
    }
}
