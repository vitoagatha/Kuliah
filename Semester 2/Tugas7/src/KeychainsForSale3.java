import java.util.Scanner;
public class KeychainsForSale3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Y Olde Keychan Shoppe\n");

        int a = 0;
        int choice = 0;
        int price = 10;
        double salesTax = 0.0825;
        int shipping = 5;
        int perShipping = 1;

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
                view_order(a, price, salesTax, shipping, perShipping);
                System.out.println();
            } else if (choice == 4){
                checkout(a, price, salesTax, shipping, perShipping);
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

    public static void view_order(int a, int price, double salesTax, int shipping, int perShipping){
        System.out.println("\nYou have " + a + " keychains.");
        System.out.println("Keychains cost $" + price + " each.");
        int total = a * 10;
        double tax = salesTax * total;
        int totalShipping = shipping + (a * perShipping);
        double totalCost = total * tax + totalShipping;
        System.out.println("Total cost is $" + totalCost + ".");
    }

    public static void checkout(int a, int price, double salesTax, int shipping, int perShipping){
        Scanner n = new Scanner(System.in);
        System.out.println("CHECKOUT\n");
        System.out.print("Whats is your name? ");
        String name = n.next();
        System.out.print("You have " + a + " keychains.");
        int total = a * 10;
        double tax = salesTax * total;
        int totalShipping = shipping + (a * perShipping);
        double totalCost = total * tax + totalShipping;
        System.out.print("Total cost $" + total + "  each.\n");
        System.out.println("Total cost is $" + totalCost + ".");
        System.out.println("Thanks for your order, " + name);
    }
}
