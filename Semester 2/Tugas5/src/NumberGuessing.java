import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 3;
        int count = 0;
        int guess;

        System.out.println("I have chosen a number between 1 and 10. Try to guesa it.");
        System.out.print("Your guess: ");
        guess = input.nextInt();
        count++;

        while (guess != number ){
            System.out.println("Thats incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = input.nextInt();
            count++;
        }
        if (guess == number)
            System.out.println("Thats right! You're good guesser.");
            System.out.println("It only took you " + count + " tries");
    }
}