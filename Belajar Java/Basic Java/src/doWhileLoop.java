public class doWhileLoop {
    public static void main(String[] args) {
        // tetap berjalan min 1 kali meskipun salah
        var counter = 100;

        do{
            System.out.println("perulangan " + counter);
            counter++;
        } while (counter <= 10);
    }
}
