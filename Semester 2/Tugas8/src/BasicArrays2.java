import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random num = new Random();

        int n[] = new int[10];

        for (int i = 0; i < n.length ; i++) {
            n[i] = 1 + num.nextInt(100);
            System.out.println("Slot " + i + " contains a " + n[i]);
        }
    }
}
