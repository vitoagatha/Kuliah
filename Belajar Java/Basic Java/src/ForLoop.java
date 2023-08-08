import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        int nilai = input.nextInt();

        for(; nilai <= 10 ; nilai++){
            System.out.println("Angka ke - " + nilai);
        }
    }
}
