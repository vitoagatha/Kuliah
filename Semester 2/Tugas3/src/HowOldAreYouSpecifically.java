import java.util.Scanner;
public class HowOldAreYouSpecifically {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Hey what's your name? ");
        String nama = input.next();

        System.out.print("Ok, " + nama + ", How old are you? ");
        int umur = input.nextInt();

        if (umur < 16 ) {
            System.out.print("You can't drive");
        } else if (umur <= 17 ) {
            System.out.print("You can't drive but note vote");
        } else if (umur <= 24) {
            System.out.print("You can vote but not rent a car");
        } else {
            System.out.print("You can do anything");
        }

    }
}
