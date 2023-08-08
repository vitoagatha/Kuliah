import java.util.Scanner;
public class AgeMessages {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("your name: ");
        String nama = input.next();
        System.out.print("Your age: ");
        int umur = input.nextInt();

        if (umur <= 16){
            System.out.println("You can't drive, " + nama);
        } if (umur >= 16 && umur <= 17){
            System.out.println("You can drive but not vote, " + nama);
        } if (umur >= 18 && umur <= 24){
            System.out.println("You can vote but not a rent car, " + nama);
        } if (umur >=25){
            System.out.println("You can do pretty much anything, " + nama);
        }
    }
}
