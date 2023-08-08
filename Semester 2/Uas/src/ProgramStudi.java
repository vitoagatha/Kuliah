import java.util.Scanner;
public class ProgramStudi {
    public static void myProgramStudi(){
        Scanner in = new Scanner(System.in);
        int menuProdi = 1;

        while (menuProdi == 1){
            System.out.println("\nProgram Studi yang ada di Universitas Gresik yaitu: ");
            System.out.println("1. Teknologi Informasi \n2. Teknik Mesin \n3. Teknik Kimia \n4. Teknik Elektro \n5. Teknik Sipil");
            System.out.println("Pilih Prodi yang ingin anda lihat atau \" x \" untuk kembali ke menu utama: ");
            System.out.print("> ");
            String prodi = in.next();
            if (prodi.equals("1")){
                System.out.println("Prodi teknologi informasi adalah prodi yang berkomitmen untuk mencapai lulusan sebagai sarjana teknik di bidang teknik informasi yang difasilitasi oleh teknologi." +
                        " \nProdi berfokus menghasilkan lulusan yang berperan sebagai agen perusahaan di bidang rekayasa perangkat lunak dan perangkat keras. " +
                        "\nDengan kehadiran teknologi informasi dan komunikasi di berbagai berbagai bidang kehidupan, memberi peluang bagi lulusan untuk bekerja di berbagai domain kehidupan.\n");
                System.out.println("Masukkan \" x \" untuk kembali: ");
                System.out.print("> ");
                String pilih = in.next();

                if (pilih.equalsIgnoreCase("x")){
                    menuProdi = 1;
                }
            } else if (prodi.equals("2")){
                System.out.println("Program Studi Teknik Mesin terfokus pada bidang konversi Energi, Perancangan , Proses Produksi dan Manufaktur serta memberikan pengetahuan Dasar Opersional " +
                        "\ndan Manajerial pengelolaan Industri. Lulusan Teknik Mesin bekerja di berbagai bidang industri otomotif, minyak bumi dan gas, mesin-mesin berat, institusi pendidikan, institusi penelitian dan industri lainnya.\n");
                System.out.println("Masukkan \" x \" untuk kembali: ");
                System.out.print("> ");
                String pilih = in.next();

                if (pilih.equalsIgnoreCase("x")) {
                    menuProdi = 1;
                }
            } else if (prodi.equals("3")){
                System.out.println("Teknik Kimia adalah bidang teknik yang berhubungan dengan produksi berbagai bahan dan produk melalui proses kimia dan proses fisis. " +
                        "\nPekerjaan profesi teknik kimia meliputi perancangan alat-alat, sistem dan proses untuk mengolah bahan baku menjadi produk yang memiliki manfaat dan nilai ekonomi yang lebih tinggi.\n");
                    System.out.println("Masukkan \" x \" untuk kembali: ");
                    System.out.print("> ");
                    String pilih = in.next();

                    if (pilih.equalsIgnoreCase("x")) {
                        menuProdi = 1;
                    }
            } else if (prodi.equals("4")){
                System.out.println("Prodi Teknik Elektro merupakan prodi yang meliputi Teknik Tenaga Listrik, Teknik Kendali dan Instumentasi, Robotika dan Automasi, Isyarat (signal) dan sistem," +
                        " \nTeknik Telekomunikasi, Teknik Komputer dan perangkat keras.\n");
                System.out.println("Masukkan \" x \" untuk kembali: ");
                System.out.print("> ");
                String pilih = in.next();

                if (pilih.equalsIgnoreCase("x")) {
                    menuProdi = 1;
                }
            } else if (prodi.equals("5")){
                System.out.println("Prodi Teknik Sipil dirancang untuk menghasilkan lulusan yang siap berperan sebagai pemimpin yang memiliki kemampuan manajerial dan berinovasi dalam bidang ketekniksipilan" +
                        " \nyang berwawasan lingkungan. Peran yang dimaksud dapat ditunjukkan oleh lulusan dalam fungsinya sebagai perencana, manajer, peneliti, pelaksana/pembangun," +
                        " \noperator atau pengelola bangunan teknik sipil.\n");
                System.out.println("Masukkan \" x \" untuk kembali: ");
                System.out.print("> ");
                String pilih = in.next();

                if (pilih.equalsIgnoreCase("x")) {
                    menuProdi = 1;
                }
            } else if (prodi.equalsIgnoreCase("x")){
                MainClass.menu();
            }
        }
    }
}
