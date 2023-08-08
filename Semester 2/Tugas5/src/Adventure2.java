import java.util.Scanner;
public class Adventure2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nextroom = 1;
        String choice = "";

        while (true){
            if (nextroom == 1){
                System.out.println("Kamu berada di rumah menyeramkan! Anda ingin pergi ke \"dapur\" atau \"toilet\" ?");
                System.out.print("> ");
                choice = input.next();
                if (choice.equalsIgnoreCase("dapur"))
                    nextroom = 2;
                else if (choice.equalsIgnoreCase("toilet"))
                    nextroom = 3;
                else
                    System.out.println(choice + " tidak ada dalam pilihan, pilih yang benar");
            }
            if (nextroom == 2){
                System.out.println("Dapur ini sangat berantakan, anda ingin membuka \"kulkas\" atau melihat \"meja\"?");
                System.out.print("> ");
                choice = input.next();
                if (choice.equalsIgnoreCase("kulkas"))
                    nextroom = 4;
                else if (choice.equalsIgnoreCase("meja"))
                    nextroom = 5;
                else
                    System.out.println(choice + " tidak ada dalam pilihan, pilih yang benar");
            }
            if (nextroom == 4){
                System.out.println("Di dalam kulkas ada makanan dan lainnya. Terlihat enak, apa anda ingin makan beberapa makanan? " +
                        "(ya/tidak)");
                System.out.print("> ");
                choice = input.next();
                if (choice.equalsIgnoreCase("ya")){
                    System.out.println("Bagus anda selamat.");
                } else if (choice.equalsIgnoreCase("tidak")){
                    System.out.println("Baiklah tinggalkan saja...");
                } break;
            } if (nextroom == 5){
                System.out.println("Mejanya berantakan, Ada piring dan makanan yang busuk, apa anda ingin makan? (ya/tidak)");
                System.out.print("> ");
                choice = input.next();
                if (choice.equalsIgnoreCase("ya")){
                    System.out.println("Anda mati keracunann makanan busuk");
                } else if (choice.equalsIgnoreCase("tidak")){
                    System.out.println("Untunglah anda gajadi mati :v");
                } break;
            }
            if (nextroom == 3){
                System.out.println("Anda berada di toilet, tidak ada apa-apa disini ayo \"kembali\"");
                System.out.print("> ");
                choice = input.next();
                if (choice.equalsIgnoreCase("kembali")){
                    nextroom = 1;
                } else {
                    System.out.println(choice + " tidak ada dalam pilihan, pilih \"kembali\"");
                }
            }
        }
    }
}