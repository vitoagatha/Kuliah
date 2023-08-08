import java.util.Scanner;
public class CountingMachineRevisited {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Count from: ");
        int countFrom = input.nextInt();
        System.out.print("Count to: ");
        int countTo = input.nextInt();
        System.out.print("Count by: ");
        int countBy = input.nextInt();

        for (int n = countFrom; n <= countTo; n += countBy){
            System.out.print(n + " ");
        }
    }
}
