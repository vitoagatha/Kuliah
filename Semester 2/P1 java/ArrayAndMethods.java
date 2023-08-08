public class ArrayAndMethods {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("x sebelum = " + x); // 3
        process(x); // 4
        System.out.println("x setelah = " + x); // 3

        int[] a = {3,3,3,};
        System.out.println("a[0] sebelum = " + a[0]);
        processArray(a);
        System.out.println("a[0] sesudah = " + a[0]);
    }

    public static void process(int x){
        x++;
        System.out.println("x = " + x);
    }

    public static void processArray(int[] a){
        a[0]++;
        System.out.println("a[0] = " + a[0]);
    }
}
