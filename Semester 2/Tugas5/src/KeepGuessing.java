import java.util.Scanner;
public class KeepGuessing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 6;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your Guess: ");
        number = input.nextInt();

        while (number != 6){
            System.out.print("That is incorrect. Guess again. ");
            number = input.nextInt();
        }

        System.out.println("That's right! You're a good Guesser.");

    }
}
