import java.util.Random;
import java.util.Scanner;

public class LocatingLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int[] a = new int[10];
        int largest = 0;
        int index = 0;

        System.out.print("Array: ");
        for(int i=0; i < a.length; i++){
            a[i]= 1 + r.nextInt(50);
            System.out.print(a[i] + "  ");
        }
        for(int i=0; i < a.length; i++){
            if(largest < a[i]){
                largest = a[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("\nThe largest value is "+largest+".");
        System.out.println("It is found in slot " + index + ".");
    }
}
