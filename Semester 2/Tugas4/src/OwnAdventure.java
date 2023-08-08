import java.util.Scanner;
public class OwnAdventure {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String jawab;
        String jawab1 = null;
        String jawab2 = null;
        String jawab3 = null;
        String jawab4 = null;
        String jawab5 = null;

        System.out.println("Welcome to Udin's tiny adventure!");
        System.out.print("\nKamu berada di rumah menyeramkan! Anda ingin pergi ke \"dapur\" atau ke \"balkon\"?");
        System.out.print("\n> ");
        jawab = input.next();

        if (jawab.equalsIgnoreCase("dapur")){
            System.out.println(
                    "Dapur ini sangat berantakan, di satu sisi ada kulkas, anda ingin membuka \"kulkas\" " +
                    "atau melihat \"meja\".");
            System.out.print("> ");
            jawab1 = input.next();
        } if (jawab1 != null && jawab1.equalsIgnoreCase("kulkas")){
            System.out.println(
                    "Di dalam kulkas ada makanan dan lainnya. Terlihat enak, apa anda ingin makan beberapa makanan? " +
                            "(ya/tidak)");
            System.out.print("> ");
            jawab2 = input.next();
        } if (jawab2 != null && jawab2.equalsIgnoreCase("ya")){
            System.out.println("Bagus, anda selamat!");
        } if (jawab2 != null && jawab2.equalsIgnoreCase("tidak")) {
            System.out.println("Anda mati kelaparan... ");
        } if (jawab1 != null && jawab1.equalsIgnoreCase("meja")) {
            System.out.println("Meja makan ini sangat berantakan. Ada banyak piring dan makanan yang sudah busuk, " +
                    " Apa anda ingin memakan makanan tersebut? (ya/tidak)");
            System.out.print("> ");
            jawab3 = input.next();
        } if (jawab3 != null && jawab3.equalsIgnoreCase("ya")){
            System.out.println("Anda mati karena keracunan makanan busuk");
        } if (jawab3 != null && jawab3.equalsIgnoreCase("tidak")){
            System.out.println("Untunglah... anda gajadi mati :v");
        }

        if (jawab.equalsIgnoreCase("balkon")){
            System.out.println(
                    "Sebelum anda sampai balkon. di ujung ruangan ada sebuah gudang, ada juga kamar yang pintunya terbuka, " +
                    " Anda ingin melihat \"kamar\" atau \"gudang\"? ");
            System.out.print("> ");
            jawab1 = input.next();
        } if (jawab1 != null && jawab1.equalsIgnoreCase("kamar")){
            System.out.println("Ada tempat tidur yang berantakan. di pojok ada lemari yang pintunya terbuka sedikit, " +
                    "apa anda ingin melihatnya? (ya/tidak)");
            System.out.print("> ");
            jawab4 = input.next();
        } if (jawab4 != null && jawab4.equalsIgnoreCase("ya")){
            System.out.println("Baunya busuk, ternyata ada bangkai tikus mati didalam lemari.");
        } else if (jawab4 != null && jawab4.equalsIgnoreCase("tidak")){
            System.out.println("baiklah, mari pergi keruangan lain.");
        } if (jawab1 != null && jawab1.equalsIgnoreCase("gudang")){
            System.out.println(
                    "Di sini sangat berantakan. ada banyak tikus juga, liat di pojok ada sebuah brankas " +
                    "apa anda ingin membuka brankas itu? (ya/tidak) ");
            System.out.print("> ");
            jawab5 = input.next();
        } if (jawab5 != null && jawab5.equalsIgnoreCase("ya")){
            System.out.println("Sayang sekali kita membutuhkan kunci untuk membuka brankas itu...");
        } else if (jawab5 != null && jawab5.equalsIgnoreCase("tidak")){
            System.out.println("baiklah, kita pergi ke balkon saja");
        }
    }
}