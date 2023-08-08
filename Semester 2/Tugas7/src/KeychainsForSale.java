import java.util.Scanner;
public class KeychainsForSale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Y Olde Keychan Shoppe\n");
        int choice = 0;

        while(true){
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout\n");

            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if (choice == 1){
                add_keychains();
                System.out.println();
            } else if (choice == 2){
                remove_keychains();
                System.out.println();
            } else if (choice == 3){
                view_order();
                System.out.println();
            } else if (choice == 4){
                checkout();
                System.out.println();
                break;
            }
        }
    }

    public static String add_keychains(){
        System.out.println("ADD KEYCHAINS");
        return null;
    }

    public static String remove_keychains(){
        System.out.println("REMOVE KEYCHAINS");
        return null;
    }

    public static String view_order(){
        System.out.println("VIEW ORDER'");
        return null;
    }

    public static String checkout(){
        System.out.println("CHECKOUT");
        return null;
    }
}
