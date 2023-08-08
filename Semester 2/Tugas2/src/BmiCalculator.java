import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double heightCm;
        double weightKg;

        System.out.print("Your height in m ");
        heightCm = input.nextDouble();
        System.out.print("Your weight in kg ");
        weightKg = input.nextDouble();

        double bmi = weightKg / (heightCm*heightCm);
        System.out.println("Your bmi " + bmi);

        double heightInc, weightLbs;
        System.out.print("Your height in inc ");
        heightInc = input.nextDouble();
        System.out.print("Your weight in lbs ");
        weightLbs = input.nextDouble();

        double bmi1 = weightLbs / (heightInc*heightInc) * 703;
        System.out.println("your Bmi is " + bmi1);

    }
}
