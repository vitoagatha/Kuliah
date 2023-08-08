import java.util.Scanner;
public class BabyNim {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sumA = 0, sumB = 0, sumC = 0;
        int pileA = 3, pileB = 3, pileC = 3;

        System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC );

        while (true){
            System.out.print("Choose a pile: ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("A")){
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumA = pileA -= remove;
                System.out.println("A: " + sumA + "\tB: " + pileB + "\tC: " + pileC );
            } else if (choice.equalsIgnoreCase("B")){
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumB = pileB -= remove;
                System.out.println("A: " + sumA + "\tB: " + sumB + "\tC: " + pileC );
            } else if (choice.equalsIgnoreCase("C")){
                System.out.print("How many to remove from pile " + choice + ": ");
                int remove = input.nextInt();
                sumC = pileC -= remove;
                System.out.println("A: " + sumA + "\tB: " + sumB + "\tC: " + sumC );
            }
            if (pileA <= 0 && pileB <= 0 && pileC <= 0){
                System.out.println("All pile are empty. Good job!");
                break;
            }
        }
    }
}
