import java.util.Scanner;
public class Pengurutan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Urutkan dari nilai yang terkecil
        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        // math
        int terkecil = Math.min(Math.min(a, b), c);
        int terbesar = Math.max(Math.max(a, b), c);
        int tengah = a + b + c - terbesar - terkecil;

        System.out.println(terkecil);
        System.out.println(tengah);
        System.out.println(terbesar);

        int terkecil2 = a;
        if (terkecil2 > b){
            terkecil2 = b;
        }
        if (terkecil2 > c){
            terkecil2 = c;
        }

        if (a <= b && b <= c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a <= c && c <= b){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b <= a && a <= c){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b <= c && c <= a){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (c <= a && a <= b){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }

    }
}
