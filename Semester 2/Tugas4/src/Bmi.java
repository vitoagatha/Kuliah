import java.util.Scanner;
public class Bmi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double heightInc, weightPounds;
        System.out.print("Your height in inches: ");
        heightInc = input.nextDouble();
        System.out.print("Your weight in pounds: ");
        weightPounds = input.nextDouble();

        double bmi = weightPounds / (heightInc*heightInc) * 703;

        if (bmi <= 18.5){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: normal weight");
        } else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: overweight");
        } else if (bmi >= 30.0){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: obese");
        }

    }
}
