import java.util.Scanner;
public class EnterYourPin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pin = 12345;

        System.out.println("Welcome To The Bank BRI");
        System.out.print("Enter Your pin ");
        int entry = input.nextInt();

        while (entry != pin){
            System.out.println("\nIncorect Pin. Try Again");
            System.out.print("Enter Your Pin ");
            entry = input.nextInt();
        }

        System.out.println("\nPin Accepted. You Now have Acces To Your Account");
    }
    /*  1. karna while menjalankan perbandingan dengan kondisi
        2. While bisa menjalankan perulangan berkali kali
        3. karena variabel entry sudah ada di awal kode
        4. Program akan melakukan perulangan terus menerus, karna jika kondisinya false maka program akan
            melakukan perintah input tapi user tidak bisa menginput data
     */
}
