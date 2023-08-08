import java.util.Scanner;
public class SpaceBoxing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your current earth weight: ");
        int earthWeight = input.nextInt();

        System.out.print("\nI have information for the following planet: ");
        System.out.print("\n1. Venus\t2. Mars\t\t3. Jupiter");
        System.out.println("\n4. Satrunus\t5. Uranus\t6. Neptunus");

        System.out.print("\nWhich plannet are you visiting ");
        int planet = input.nextInt();

        double planetWeight = 0.0;
        if (planet == 1){
            planetWeight = earthWeight * 0.78;
        } else if (planet == 2){
            planetWeight = earthWeight * 0.39;
        } else if (planet == 3){
            planetWeight = earthWeight * 2.65;
        } else if (planet == 4){
            planetWeight = earthWeight * 1.17;
        } else if (planet == 5){
            planetWeight = earthWeight * 1.05;
        } else if (planet == 6){
            planetWeight = earthWeight * 1.23;
        }

        System.out.print("Your Weight would be " + planetWeight + " pounds on that planet");
    }
}
