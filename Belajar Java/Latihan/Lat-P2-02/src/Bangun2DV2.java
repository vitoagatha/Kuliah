public class Bangun2DV2 {
    public static void main(String[] args) {
        Lingkaran1 lingkaran1 = new Lingkaran1();

        lingkaran1.radius = 4.9;
        System.out.println("Lingkaran");
        lingkaran1.print();

        PersegiPanjang1 perPanjang1 = new PersegiPanjang1();

        perPanjang1.panjang = 8.5;
        perPanjang1.lebar = 4.5;
        System.out.println("\nPersegi Panjang");
        perPanjang1.printPer();

        Segitiga1 segitiga1 = new Segitiga1();
        segitiga1.sisiX = 3.0;
        segitiga1.sisiY = 3.0;
        segitiga1.sisiZ = 4.0;
        System.out.println("\nSegitiga");
        segitiga1.printSeg();
    }
}

class Lingkaran1{
    double radius;
    double diameter(){
        return 2 * radius;
    }
    double keliling(){
        return Math.PI * diameter();
    }
    double luas(){
        return Math.PI * radius * radius;
    }

    void print(){
        System.out.printf(
                "R = %.2f, D = %.2f, K = %.2f, L = %.2f",
                radius, diameter(), keliling(), luas());
    }
}

class PersegiPanjang1{
    double panjang;
    double lebar;
    double diagonal(){
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }
    double keliling(){
        return 2 * (panjang + lebar);
    }
    double luas(){
        return panjang * lebar;
    }
    void printPer(){
        System.out.printf(
                "P = %.2f, L = %.2f, K = %.2f, A = %.2f, D = %.2f\n",
                panjang, lebar, keliling(), luas(), diagonal());
    }
}

class Segitiga1{
    double sisiX;
    double sisiY;
    double sisiZ;
    double keliling(){
        return sisiX + sisiY + sisiZ;
    }
    double semiPerimeter1(){
        return keliling() / 2.0;
    }
    double luas(){
        return Math.sqrt(semiPerimeter1() * (semiPerimeter1() - sisiX) * (semiPerimeter1() - sisiY) * (semiPerimeter1() - sisiZ));
    }
    void printSeg(){
        System.out.printf(
                "Sisi X = %.2f, Sisi Y = %.2f, Sisi Z = %.2f, K = %.2f, A = %.2f",
                sisiX, sisiY, sisiZ, keliling(), luas());
    }
}