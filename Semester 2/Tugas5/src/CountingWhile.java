import java.util.Scanner;
public class CountingWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Tuliskan sebuah pesan!");
        System.out.print("Pesan: ");
        String pesan = input.nextLine();
        System.out.print("How many times? ");
        int brapa = input.nextInt();

        int n = 10;
        int count = 0;
        while (count < brapa){
            System.out.println(n + " . " + pesan);
            n += 10;
            count++;
        }
    }
}
