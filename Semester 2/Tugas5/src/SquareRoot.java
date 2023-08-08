import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double n;

        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");

        do {
            n = input.nextInt();

            if (n < 0 ){
                System.out.print("You Can't take the square root of a negative number." +
                "\nTry again: ");
            }
        } while (n < 0);
        System.out.println("The Square root of " + n + " is " + Math.sqrt(n));
    }
}
