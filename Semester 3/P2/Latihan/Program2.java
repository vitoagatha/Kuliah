import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan banyak mahasiswa: ");
        int banyakMahasiswa = in.nextInt();
        in.nextLine();

        Mahasiswa[] data = new Mahasiswa[banyakMahasiswa];
        for (int i = 0; i < banyakMahasiswa; i++) {
            data[i] = new Mahasiswa(); // data disimpan di class mahasiswa

            System.out.print("Masukkan nama mahasiswa ke- " + (i = 1) + ": ");
            data[i].nama = in.nextLine();

            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            data[i].nilai = in.nextInt();
            in.nextLine();

            System.out.print("Masukkan asal mahasiswa ke- " + (i + 1) + ": ");
            data[i].asal = in.nextLine();
        }
        
        int n = banyakMahasiswa;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (data[i -1].nilai < data[i].nilai){
                    Mahasiswa temp = data[i - 1]; // mengurutkan data
                    data[i - 1] = data[i];
                    data[i] = temp;

                    String namaTemp = data[i - 1].nama;
                    data[i - 1].nama = data[i].nama;
                    data[i].nama = namaTemp;

                    String asalTemp = data[i - 1].asal;
                    data[i - 1].asal = data[i].asal;
                    data[i].asal = asalTemp;

                    swapped = true;
                }
            }

        } while (swapped);

        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.printf("%d. Nama = %s, nilai = %d, asal = %s\n", (i + 1), data[i].nama, data[i].nilai, data[i].asal);
        }
        in.close();
    } 
}

class Mahasiswa{
    String nama;
    int nilai;
    String asal;
}