import java.util.Scanner;
public class TwoMoreQuestions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("TWO MORE QUESTION, BABY!");
        System.out.println("Think of something and I'll try to guess it!");

        System.out.print("\nQuestion 1) Does it stay inside or outside or both? ");
        String answer = input.next().toLowerCase();
        System.out.print("Question 2) is it a living thing? ");
        String answer2 = input.next().toLowerCase();

        if (answer.equals("inside") && answer2.equals("yes")){
            System.out.println("\nThen what else could you be thinking of besides a houseplant");
        } if (answer.equals("inside") && answer2.equals("no")){
            System.out.println("\nObviously the nonliving, thing in your mind is a shower curtain");
        } if (answer.equals("outside") && answer2.equals("yes")){
            System.out.println("\nThen what else could you be thinking of besides a python?");
        } if (answer.equals("outside") && answer2.equals("no")){
            System.out.println("\nObviously the nonliving, thing in your mind is a billboard");
        } if (answer.equals("both") && answer2.equals("yes")){
            System.out.println("\nThen what else could you be thinking of besides a ant");
        } if (answer.equals("both") && answer2.equals("no")){
            System.out.println("\nObviously the nonliving, thing in your mind is a dead ant");
        }
    }
}
