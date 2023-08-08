import java.util.Scanner;
public class ADumbCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float number1, number2, number3;

        System.out.print("What is Your first number? ");
        number1 = input.nextFloat();
        System.out.print("What is your second number? ");
        number2 = input.nextFloat();
        System.out.print("What is your third number?");
        number3 = input.nextFloat();

        System.out.println((number1 + number2 + number3) + "/2" + " is "+ (number1 + number2 + number3)/2);

    }
}
