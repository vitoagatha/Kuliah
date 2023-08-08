import java.util.Scanner;
public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Are you ready for a quiz? ");
        input.next();
        System.out.println("Okay, here it");

        int answer1, answer2, answer3;
        int score = 0;
        System.out.println("\nWhat is the capital of alaska? ");
        System.out.println("1) Melbourne \n2) Achorage\n3) juneau");
        System.out.print("> ");
        answer1 = input.nextInt();

        if (answer1 == 3) {
            System.out.print("That's right ");
            score++;
        } else {
            System.out.println("Sorry, the capital of alaska is juneau");
        }

        System.out.println("Overal, you got " + score + " out of 3 correct");
    }
}
