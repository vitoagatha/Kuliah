import java.util.Random;

public class BasicArrays3 {
    public static void main(String[] args) {
        Random num = new Random();

        int n[] = new int[1000];

        for (int i = 0; i < n.length; i++) {
            int y = 1 + num.nextInt(10,90);
            n[i] = y;
        }
        for (int i = 0; i < n.length ; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
