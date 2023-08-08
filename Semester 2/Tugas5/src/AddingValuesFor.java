import java.util.Scanner;
public class AddingValuesFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        int sum = 0;
        for (int n = 1; n <= number; n++){
            System.out.print(n + " ");
            sum += n;
        }
        System.out.print("\nThe sum is " + sum);
    }
}
