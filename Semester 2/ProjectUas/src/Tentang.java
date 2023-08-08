import java.util.Scanner;

public class Tentang {
    public static void myTentang(){
        Scanner in = new Scanner(System.in);

        System.out.println("VISI, MISI, DAN TUJUAN UNIVERSITAS GRESIK\n");

        System.out.println("VISI: \nMenjadi Universitas berkualitas, berkarakter bangsa dan berwawasan global dalam penyelenggaraan tridharma perguruan tinggi\n");

        System.out.println("MISI: \nMenyelenggarakan tridharma perguruan tinggi yang berkualitas, berkarakter dan berwawasan global.\n" +
                "Menyelenggarakan tata kelola universitas yang kredibel, transparansi, akuntabel dan berkarakter.\n" +
                "Membangun jejaring dan kemitraan dengan institusi dalam dan luar negeri pada pelaksanaan tridharma perguruan tinggi.\n");

        System.out.println("TUJUAN: \nTerselenggaranya pendidikan  yang berkualitas, berkarakter dan berwawasan global.\n" +
                "Terlaksananya penelitian dan pengabdian kepada masyarakat yang bermutu untuk pengembangan ilmu pengetahuan dan teknologi.\n" +
                "Terwujudnya tata kelola universitas yang kredibel, transparansi, akuntabel dan berkarakter.\n" +
                "Terwujudnya jaringan kerjasama dengan berbagai pihak dalam penyelenggaraan tridharma perguruan tinggi ditingkat nasional dan internasional.\n");

        System.out.println("Masukkan \" x \" untuk kembali: ");
        System.out.print("> ");
        String pilih = in.next();

        if (pilih.equalsIgnoreCase("x")){
            MainClass.menu();
        }
    }
}
