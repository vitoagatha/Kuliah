public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] nilai = {80,80,80,80};
        selamat("budi", nilai);

        // variabel argument
        selamat("jamal", 80,80,75,80);
    }

    static void selamat(String nama, int... nilai){
        int total = 0;
        for (var nilai1: nilai){
        total += nilai1;
        }
        var totalNilai = total/nilai.length;

        if (totalNilai >= 75){
            System.out.println("Selamat " + nama + ", anda lulus");
        } else {
            System.out.println("Selamat " + nama + ", anda tidak lulus");
        }
    }
}
