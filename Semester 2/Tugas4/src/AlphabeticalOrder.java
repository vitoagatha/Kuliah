import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your last name? ");
        String nama = input.next();

        if (("Carswell").compareToIgnoreCase(nama) >= 0){
            System.out.println("You don't have to wait long ");
        } else if (("jones").compareToIgnoreCase(nama) >= 0){
            System.out.println("That's not bad");
        } else if (("Smith").compareToIgnoreCase(nama) >= 0){
            System.out.println("Looks like a bit of wait");
        } else if (("young").compareToIgnoreCase(nama) >= 0){
            System.out.println("It's gonna be a while");
        } else if ((nama).compareToIgnoreCase("young") >=0 ){
            System.out.println("Not going anywhere for a while?");
        }
    }
}
