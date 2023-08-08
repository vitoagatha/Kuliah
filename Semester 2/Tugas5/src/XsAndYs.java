public class XsAndYs {
    public static void main(String[] args) {

        System.out.println("x\t  y\n____________");
        for (double n = -10; n <= 10; n = n + 0.5) {
            double x = Math.pow(n,2);
            System.out.println(n + "\t" + x);
        }
    }
}