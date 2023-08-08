import java.util.Scanner;
public class WorstNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("The worst number guessing game ever!");
        System.out.print("I'm thinking of a number between 1-10. Try to gess! ");
        int number = input.nextInt();

        int secretNumber = 4;

        if (number == 4){
            System.out.println("Lol!! U got it! The number is " + secretNumber);
        } else {
            System.out.println("Woot! you wrong! It was " + secretNumber);
        }
    }
}
