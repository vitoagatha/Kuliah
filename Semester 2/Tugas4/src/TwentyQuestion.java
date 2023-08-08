import java.util.Scanner;
public class TwentyQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TWO QUESTION");
        System.out.println("Think of an object, and I'll try to guess it.");

        System.out.print("\nQuestion 1) Is it animal, vegetable, or mineral" + "\n> ");
        String answer = input.next().toLowerCase();
        System.out.print("Question 2) is it bigger than a breadbox?" + "\n> ");
        String answer2 = input.next().toLowerCase();

        if (answer.equals("animal") && answer2.equals("yes")){
            System.out.println("\nMy guess is that you are thinking of a cow" +
                    "\nI would ask you if I'm right, but I don't actually care.");
        } if (answer.equals("animal") && answer2.equals("no")){
            System.out.println("\nMy guess is that you are thinking of a mouse" +
                    "\nI would ask you if I'm right, but I don't actually care.");
        } if (answer.equals("vegetable") && answer2.equals("yes")){
            System.out.println("\nMy guess is that you are thinking of a watermelon" +
                    "\nI would ask you if I'm right, but I don't actually care.");
        } if (answer.equals("vegetable") && answer2.equals("no")){
            System.out.println("\nMy guess is that you are thinking of a carrot" +
                    "\nI would ask you if I'm right, but I don't actually care.");
        } if (answer.equals("mineral") && answer2.equals("yes")){
            System.out.println("\nMy guess is that you are thinking of a truck" +
                    "\nI would ask you if I'm right, but I don't actually care.");
        } if (answer.equals("mineral") && answer2.equals("no")){
            System.out.println("\nMy guess is that you are thinking of a papper clip" +
                    "\nI would ask you if I'm right, but I don't actually care.");
        }
    }
}