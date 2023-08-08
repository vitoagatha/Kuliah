import java.util.Scanner;
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Starting number: ");
        int number = scanner.nextInt();

        System.out.print(number + "    ");
        int counter = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
            System.out.print(number + "    ");
            counter++;
        }
        System.out.println();
        System.out.println("Terminate after " + counter + " steps");
    }
}