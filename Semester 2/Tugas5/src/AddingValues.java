import java.util.Scanner;
public class AddingValues {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int total = 0;
        int number;

        System.out.println("I will add up the number you give me.");

        while (true) {
            System.out.print("Number: ");
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            total += number;
            System.out.println("The total so far is " + total);
        }
        System.out.println("Total is " + total);
    }
}