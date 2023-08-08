public class HurufVokal047 {

    public static int hitungHurufVokal(String kata){
        kata = "Perempuan";
        String kalimat = "Ani adalah mahasiswa uisi";
        int vokal = 0;
        char c;
        for (int i = 0; i < kata.length() ; i++) {
            c = kata.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o' ){
                vokal++;
            }
        }
        return vokal;
    }

    public static void main(String[] args) {
        String kata = "Perempuan";
        String kalimat = "Ani adalah mahasiswa uisi";

        System.out.println("Banyak huruf vokal dalam: ");
        System.out.println(kata + " = " + hitungHurufVokal(kata));
        System.out.println(kalimat + " = " + hitungHurufVokal(kalimat));
    }
}
