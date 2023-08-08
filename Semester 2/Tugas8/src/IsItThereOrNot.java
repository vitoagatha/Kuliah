import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int a[] = new int[10];
        boolean found = false;

        System.out.print("Array: ");
        for(int i=0; i < a.length; i++){
            a[i] = 1 + r.nextInt(50);
            System.out.print(a[i] + "  ");
        }

        System.out.println();
        System.out.print("Value to find: ");
        int value = in.nextInt();
        System.out.println();
        for(int j = 0; j < a.length; j++){
            if (value == a[j] && !found){
                found = true;
            }
        }
        if (found)
            System.out.println(value + " is in the array.");
        else
            System.out.println(value+" is not in the array.");
    }
}