import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pileA = 3, pileB = 4, pileC = 5;
        int sumA = 0, sumB = 0, sumC = 0;

        System.out.print("Player 1, enter your name: ");
        String player1 = input.next();
        System.out.print("Player 2, enter your name: ");
        String player2 = input.next();

        System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);

        while (true) {
            System.out.print(player1 + ", choose a pile: ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumA = pileA -= remove;
                System.out.println("A: " + sumA + "\tB: " + pileB + "\tC: " + pileC);
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumB = pileB -= remove;
                System.out.println("A: " + pileA + "\tB: " + sumB + "\tC: " + pileC);
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumC = pileC -= remove;
                System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + sumC);
            }
            if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
                System.out.println(player1 + ", there are no counters left, so " + player2 + " wins!");
                break;
            }

            System.out.print(player2 + ", choose a pile: ");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumA = pileA -= remove;
                System.out.println("A: " + sumA + "\tB: " + pileB + "\tC: " + pileC);
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumB = pileB -= remove;
                System.out.println("A: " + pileA + "\tB: " + sumB + "\tC: " + pileC);
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumC = pileC -= remove;
                System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + sumC);
            }
            if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
                System.out.println(player2 + ", there are no counters left, so " + player1 + " wins!");
                break;
            }
        }
    }
}
