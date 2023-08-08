import java.util.Scanner;

public class Abcdn047 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = in.nextInt();

        for (int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++){
                int num = i;
                System.out.print(num + " ");
            }
        }
    }
}
