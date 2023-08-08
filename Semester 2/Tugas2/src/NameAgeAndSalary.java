import java.util.Scanner;
public class NameAgeAndSalary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;
        double gaji;

        System.out.println("Hallo, What is your name?");
        nama = input.next();

        System.out.println("Hi " + nama + "! How old are you?");
        umur = input.nextInt();

        System.out.println("So you are " + umur + " That's not old at all");
        System.out.println("How much do you make, "+ nama + "?");
        gaji = input.nextDouble();

        System.out.println(gaji + "! I hope that's per hour and not per year! LOL!");
    }
}
