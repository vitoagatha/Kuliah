import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultidimensi{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[][] ar = {
            {"INI", "INI", "INI", "INI"},
            {"INI", "INI", "INI", "INI"}
        };
        /*System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2] + " " + arr[0][3]);
        System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2] + " " + arr[1][3]);
        */

        //System.out.println(Arrays.deepToString(ar));

        System.out.print("Masukkan jumlah baris: ");
        int baris = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = in.nextInt();

        int m = baris;
        int n = kolom;

        String[][] arr = new String[m][n];
        // cara 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Masukkan isi array: ");
                String hi = in.next();
                arr[i][j] = hi;
            }
        }

        System.out.println(Arrays.deepToString(arr));

        // array multidimensi bebas
        String[][] arr2 = new String[2][];
        arr2[0] = new String[3];
        arr2[1] = new String[4];
    }
}