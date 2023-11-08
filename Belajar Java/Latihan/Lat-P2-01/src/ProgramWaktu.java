public class ProgramWaktu {
    public static void main(String[] args) {
        Waktu pagi = new Waktu(7);
        pagi.print();
    }
}

class Waktu{
    int jam;
    int menit;
    int detik;

    Waktu(int jam){
        this.jam = jam;
    }
    void print(){
        System.out.printf(
                "%02d:%02:%02d\n",
                jam, menit, detik);
    }
}