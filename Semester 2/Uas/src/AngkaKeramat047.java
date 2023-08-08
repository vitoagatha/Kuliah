import java.util.Scanner;

public class AngkaKeramat047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;

        System.out.print("Masukkan nilai: ");
        String nilai = in.nextLine();

        for (int i = 0; i < nilai.length(); i++) {
            if (Character.getNumericValue(nilai.charAt(i)) == 4){
                count++;
            }
        }
        System.out.println("nilai 4 yang muncul sebanyak: " + count);
    }
}
