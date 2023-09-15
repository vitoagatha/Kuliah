public class Bangun2D {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();

        lingkaran.radius = 4.9;
        lingkaran.diameter = 2 * lingkaran.radius;
        lingkaran.keliling = Math.PI * lingkaran.diameter;
        lingkaran.luas = Math.PI * lingkaran.radius * lingkaran.radius;
        System.out.println("Lingkaran");
        System.out.printf(
                "R = %.2f, D = %.2f, K = %.2f, L = %.2f\n",
                lingkaran.radius, lingkaran.diameter, lingkaran.keliling, lingkaran.luas);


        PersegiPanjang perPanjang = new PersegiPanjang();

        perPanjang.panjang = 8.5;
        perPanjang.lebar = 4.5;
        perPanjang.keliling = 2 * (perPanjang.panjang + perPanjang.lebar); // 2 * P + L
        perPanjang.luas = perPanjang.panjang * perPanjang.lebar; // P * L
        perPanjang.diagonal = Math.sqrt(Math.pow(perPanjang.panjang, 2) + Math.pow(perPanjang.lebar, 2)); // akar P2 + L2
        System.out.println("Persegi Panjang");
        System.out.printf(
                "P = %.2f, L = %.2f, K = %.2f, A = %.2f, D = %.2f\n",
                perPanjang.panjang, perPanjang.lebar, perPanjang.keliling, perPanjang.luas, perPanjang.diagonal);

        Segitiga segitiga = new Segitiga();

        segitiga.sisiA = 3.0;
        segitiga.sisiB = 3.0;
        segitiga.sisiC = 4.0;
        segitiga.keliling = segitiga.sisiA + segitiga.sisiB + segitiga.sisiC;
        // rumus segitiga menggunakan rumus heron
        double semiPerimeter = segitiga.keliling / 2.0; // L = akar s * (s - sisiA) * (s - sisiB) * (s - sisiC)
        segitiga.luas = Math.sqrt(semiPerimeter * (semiPerimeter - segitiga.sisiA) * (semiPerimeter - segitiga.sisiB) * (semiPerimeter - segitiga.sisiC));
        System.out.println("Segitiga");
        System.out.printf(
                "Sisi A = %.2f, Sisi B = %.2f, Sisi C = %.2f, K = %.2f, A = %.2f",
                segitiga.sisiA, segitiga.sisiB, segitiga.sisiC, segitiga.keliling, segitiga.luas);
    }
}

class Lingkaran{
    double diameter;
    double radius;
    double keliling;
    double luas;
}

class PersegiPanjang{
    double panjang;
    double lebar;
    double diagonal;
    double keliling;
    double luas;
}

class Segitiga{
    double sisiA;
    double sisiB;
    double sisiC;
    double keliling;
    double luas;
}
