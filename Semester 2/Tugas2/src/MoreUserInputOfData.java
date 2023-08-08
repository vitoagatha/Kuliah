import java.util.Scanner;
public class MoreUserInputOfData {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String firstName, lastName, loginName;
        int grade, studentId;
        double gpa;

        System.out.println("Please enter the following information so i can sell it profit!");
        System.out.print("First name: ");
        firstName = input.nextLine();

        System.out.print("Last name: ");
        lastName = input.nextLine();

        System.out.print("Grade (9-12: ) ");
        grade = input.nextInt();

        System.out.print("Studen Id: ");
        studentId = input.nextInt();
        input.nextLine();
        System.out.print("Login: ");
        loginName = input.next();

        System.out.print("GPA (0.0-4.0): ");
        gpa = input.nextDouble();

        System.out.println("Your information: ");
        System.out.println("\tLogin: " + loginName);
        System.out.println("\tID: " + studentId);
        System.out.println("\tName: " + lastName + ", " + firstName);
        System.out.println("\tGPA: " + gpa);
        System.out.println("\tGrade: "+ grade);
    }
}
