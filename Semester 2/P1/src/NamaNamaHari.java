import java.util.Scanner;
public class NamaNamaHari {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Hari ke-: ");
        int hari = input.nextInt();

        switch (hari){
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jmu'at");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Error");
        }
        /*
        switch (hari){
            case 1, 2, 3, 4, 5:
                System.out.println("Hari kerja");
                break;
            case 6:
            case 7:
                System.out.println("Hari libur");
        }*/

        String namaHari = switch(hari){
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jum'at";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Error";
        };
        System.out.println(namaHari);
    }
}
