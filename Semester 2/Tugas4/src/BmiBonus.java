import java.util.Scanner;
public class BmiBonus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double heightInc, weightPounds;
        System.out.print("Your height in inches: ");
        heightInc = input.nextDouble();
        System.out.print("Your weight in pounds: ");
        weightPounds = input.nextDouble();

        double bmi = weightPounds / (heightInc*heightInc) * 703;

        if (bmi <= 15.0){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: very severely underweight");
        } else if (bmi <= 16.0){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: severly underweight");
        } else if (bmi >= 16.1 && bmi <= 18.4){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: normal weight");
        } else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: overweight");
        } else if (bmi >= 30.0 && bmi <= 34.9){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: moderately obese");
        } else if (bmi >= 35.0 && bmi <= 39.9){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: severely obese");
        } else if (bmi >= 40.0){
            System.out.println("your Bmi is " + bmi);
            System.out.println("Bmi Category: very severely (or \"morbidly\") obese");
        }

    }
}
