import java.util.Scanner;
public class HiLowLimited {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 1 + (int) (Math.random() * 99);
        int guess = 0;
        int guessUser = 1;
        int maxGuess = 7;
        int count = 0;

        System.out.println("I'm thinking of a number between 1-100. You have 7 guess.");
        System.out.print("First guess: ");
        guess = input.nextInt();
        count++;
        guessUser++;

        while (guess != number){
            if (guess < number){
                System.out.println("Sorry, you are to low");
                System.out.print("Guess # " + guessUser + " : ");
                guess = input.nextInt();
                count++;
                guessUser++;
            } else if (guess > number){
                System.out.println("Sorry, that guess is too high");
                System.out.print("Guess # " + guessUser + " : ");
                guess = input.nextInt();
                count++;
                guessUser++;
            }
            if (count >= maxGuess){
                System.out.println("You didn't guess it in 7 tries. you lose.");
                break;
            }
        }
        if (guess == number){
            System.out.println("You guessed it ");
        }
    }
}
