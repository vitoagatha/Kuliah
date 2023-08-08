import java.util.Scanner;
public class PersegiPanjang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan m: ");
        int m = input.nextInt();
        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        cetakPersegiPanjang(m, n);
        }
    public static void cetakPersegiPanjang(int m, int n){
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
