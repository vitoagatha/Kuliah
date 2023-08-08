import java.util.Scanner;
public class GenderGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        String gender = input.next();
        System.out.print("First name: ");
        String firstName = input.next();
        System.out.print("Last name: ");
        String lastName = input.next();
        System.out.print("Age: ");
        int age = input.nextInt();

        String married = null;
        if (gender.equalsIgnoreCase("F") && age >= 20) {
            System.out.print("Are you married, " + lastName + " (Y or N)? ");
            married = input.next();
        } else if (gender.equalsIgnoreCase("F") && age <= 20) {
            System.out.println("Then I shall call you " + firstName + " " + lastName);
        } if (married != null && married.equalsIgnoreCase("Y")) {
            System.out.println("Then I shall call you Mrs. " + lastName);
        } else if (married != null && married.equalsIgnoreCase("N")){
            System.out.println("Then I shall call you Ms. " + lastName);
        }

        if (gender.equalsIgnoreCase("M") && age >= 20){
            System.out.println("Then I shall call you Mr. " + lastName);
        } else {
            System.out.println("Then I shall call you " + firstName + " " + lastName);
        }
    }
}
