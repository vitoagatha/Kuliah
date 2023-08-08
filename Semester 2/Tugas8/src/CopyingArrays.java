import java.util.Random;
import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        Random r = new Random();

        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length ; i++) {
            int x = 1 + r.nextInt(100);
            a[i] = x;
        }

        System.out.print("Array 1 : ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        }

        b = Arrays.copyOf(a, 10);

        System.out.print("\nArray 2 : ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
