public class switchStatement {
    public static void main(String[] args) {
        //switch ==
        var nilai = "F";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "c":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
        }
        // switch lambda
        switch (nilai){
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B", "C" -> System.out.println("anda lulus");
            case "D" -> System.out.println("anda tidak lulus");
            default -> System.out.println("mungkin anda salah jurusan");
        }

        // switch yield
        String ucapan;
        ucapan = switch (nilai) {
            case "A" : yield "Anda lulus dengan baik";
            case "B", "C" : yield "anda lulus";
            case "D" : yield "anda tidak lulus";
            default : yield "mungkin anda salah jurusan";
        };
        System.out.println(ucapan);

        // ternary operator
        var nilai1 = 75;
        String Ucapan = nilai1 >= 75 ? "selamat anda lulus" : "silahkan coba lagi";
        System.out.println(Ucapan);

        // for loop

        for (var counter = 1;counter <= 5;){ // init statement
            System.out.println("perulalngan " + counter);

            counter++;
        }

        for (var counter = 1;counter <= 5;counter++){ // post statement
            System.out.println("perulalngan " + counter);

        }

        int counter = 1;

        while (counter <= 10){
            System.out.println("perulangan " + counter);

            counter++;
        }

    }
}
