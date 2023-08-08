import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

        Daftar.readDataPendaftar(); // memuat data dari file
        menu();

    }

    public static void menu(){
        Scanner in = new Scanner(System.in);
        int menu = 1;

        System.out.println("\nSelamat datang di Penerimaan Mahasiswa Baru Universitas Gresik.");
        while (menu == 1){
            System.out.println("Pilih menu di bawah ini untuk melihat lebih jauh tentang Universitas Gresik:");
            System.out.println("1. Program Studi \n2. Daftar \n3. Tentang UNGRES");
            System.out.print("> ");
            String pilihan = in.next();
            if (pilihan.equals("1")){
                ProgramStudi.myProgramStudi();
            } else if (pilihan.equals("2")){
                Daftar.myDaftar();
            } else if (pilihan.equals("3")){
                Tentang.myTentang();
            } else {
                System.out.println("Pilih nomor dari pilihan menu tersebut.");
            }
        }
    }
}
