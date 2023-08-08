import java.util.Scanner;
public class HowOldAreYou {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Hey what is your name? ");
        String nama = input.next();

        System.out.print("Hey how old are you? ");
        int umur = input.nextInt();

        if (umur <= 16) {
            System.out.println("You can't drive, " + nama);
        } else if (umur <= 18) {
            System.out.println("You can't vote, " + nama);
        } else if (umur <= 25) {
            System.out.println("You can't rent a car, " + nama);
        } else {
            System.out.println("You can't do anything that's legal, " + nama);
        }

    }
}
