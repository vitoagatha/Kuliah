import java.util.Scanner;
public class CountingMachine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Count to: ");
        int number = input.nextInt();

        for (int n = 0; n <= number; n++){
            System.out.print(n + "  ");
        }
    }
}
