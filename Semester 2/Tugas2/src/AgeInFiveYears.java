import java.util.Scanner;
public class AgeInFiveYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("Hello, What is your name? ");
        nama = input.nextLine();
        System.out.print("Hi, " + nama + "! How old are you ");
        umur = input.nextInt();

        System.out.println("Did you know that in five years you will be " + (umur+5) + " years old!");
        System.out.println("And five years ago you were " + (umur-5) + "! imagine that!" );
    }
}
