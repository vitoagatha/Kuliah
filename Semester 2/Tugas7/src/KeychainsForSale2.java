import java.util.Scanner;
public class KeychainsForSale2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Y Olde Keychan Shoppe\n");

        int a = 0;
        int choice = 0;
        int price = 10;
        while(true){
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout\n");

            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if (choice == 1){
                a = add_keychains(a);
                System.out.println();
            } else if (choice == 2){
                a = remove_keychains(a);
                System.out.println();
            } else if (choice == 3){
                a = view_order(a);
                System.out.println();
            } else if (choice == 4){
                checkout(a, price);
                System.out.println();
                break;
            }
        }
    }

    public static int add_keychains(int a){
        Scanner n = new Scanner(System.in);
        System.out.print("\nYou have " + a + " keychains. How many to add? ");
        int add = n.nextInt();
        a = a + add;
        System.out.println("You now have " + a + " keychains.");
        return a;
    }

    public static int remove_keychains(int a){
        Scanner n = new Scanner(System.in);
        System.out.print("\nYou have " + a + " keychains. How many to remove? ");
        int remove = n.nextInt();
        int sum = a - remove;
        System.out.println("You now have " + a + " keychains.");
        return sum;
    }

    public static int view_order(int a){
        System.out.println("\nYou have " + a + " keychains.");
        System.out.println("Keychains cost $10 each.");
        int sum = 10 * a;
        System.out.println("Total cost is $" + sum + ".");
        return sum;
    }

    public static void checkout(int a, int price){
        Scanner n = new Scanner(System.in);
        System.out.println("CHECKOUT\n");
        System.out.print("Whats is your name? ");
        String name = n.next();
        System.out.print("You have " + a + " keychains.");
        System.out.print("Total cost $" + price + "  each.\n");
        int total = a * price;
        System.out.print("Total cost is $" + total + ".\n");
        System.out.println("Thanks for your order, " + name);
    }
}
