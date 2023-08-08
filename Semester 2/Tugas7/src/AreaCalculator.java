import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("1) Triangle \n2) Rectangle \n3) Square \n4) Circle \n5) Quit ");
            System.out.print("Which shape: ");
            int choice = in.nextInt();

            if (choice == 1){
                System.out.print("\nBase: ");
                int base = in.nextInt();
                System.out.print("Height: ");
                int height = in.nextInt();
                double area = area_triangle(base, height);
                System.out.println("\nThis area is " + (int) area + ".\n");
            } else if (choice == 2){
                System.out.print("\nLenght: ");
                int length = in.nextInt();
                System.out.print("Width: ");
                int width = in.nextInt();
                double area = area_rectangle(length, width);
                System.out.println("\nThis area is " + (int) area + ".\n");
            } else if (choice == 3){
                System.out.print("\nSide length: ");
                int side = in.nextInt();
                double area = area_square(side);
                System.out.println("\nThis area is " + (int) area + ".\n");
            } else if (choice == 4){
                System.out.print("\nRadius: ");
                int radius = in.nextInt();
                double area = area_circle(radius);
                System.out.println("\nThis area is " + (int) area + ".\n");
            } else if (choice == 5){
                System.out.println("Goodbye.");
                break;
            }
        }
    }

    public static double area_circle(int radius){

        return Math.pow(radius, 2) * Math.PI;
    }

    public static int area_rectangle(int length, int width){

        return length * width;
    }

    public static int area_square(int side){

        return (int) Math.pow(side, 2);
    }

    public static double area_triangle(int base, int height){

        return base * height / 2;
    }
}