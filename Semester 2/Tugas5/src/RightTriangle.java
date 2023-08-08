import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int side1, side2, side3;

        System.out.println("Enter three integers");
        System.out.print("Side 1: ");
        side1 = input.nextInt();
        System.out.print("Side 2: ");
        side2 = input.nextInt();

        while (side2 < side1){
            System.out.println(side2 + " is smaller than " + side1 + " Try again.");
            System.out.print("Side 2: ");
            side2 = input.nextInt();
            }

        System.out.print("Side 3: ");
        side3 = input.nextInt();

        while (side3 < side2){
            System.out.println(side3 + " is smaller than " + side2 + " Try again.");
            System.out.print("Side 3: ");
            side3 = input.nextInt();
        }

        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
        double check = Math.sqrt( side1 * side1 + side2 * side2);

        if (check == side3){
            System.out.println("These side *do* make a right triangle. Yippy-Skippy!");
        } else {
            System.out.println("NO! these sides do not make a right triangle!");
        }
    }
}
