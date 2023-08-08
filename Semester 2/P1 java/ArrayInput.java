import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran array : ");   
        int n = input.nextInt();

        input.nextLine();// fix scanner bug

        int[] nilai;
        nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            
            System.out.print("Masukkan nilai di indexs " + i + " : ");
            nilai[i] = input.nextInt();
            
        }

        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("nilai indexs " + i + " : " + nilai[i]);
            
        }
    }
}
