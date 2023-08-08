import java.util.Random;
import java.util.Scanner;

public class FindingValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            int n = 1 + r.nextInt(50);
            num[i] = n;
        }

        System.out.print("Array : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.print("Value to find : ");
        int ans = in.nextInt();

        System.out.println();
        for(int i=0; i < num.length; i++){
            if(num[i] == ans){
                System.out.println(ans + " is in the array.");
            }
        }
    }
}
