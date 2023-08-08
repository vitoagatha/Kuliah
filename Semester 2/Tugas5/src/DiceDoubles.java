import java.util.Random;
public class DiceDoubles {
    public static void main(String[] args){
        System.out.println("Here comes the dice!");

        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        while(!(dice1 == dice2)){
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            int total = dice1 + dice2;
            System.out.println("The total is " + total);

            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
        }
        System.out.println("Roll #1: " + dice1);
        System.out.println("Roll #2: " + dice2);
        int total = dice1 + dice2;
        System.out.println("The total is " + total);
    }
}
