public class Recursion {
    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(factorial(5));

        System.out.println(fibonacci(10));

        int n = 10;
        for (int i = 0; i < n; i++){
            System.out.print(fibonacci2(i) + " ");
        }

        System.out.println("\n" + gcd(8, 12));

    }

    public static int factorial(int n){
        //factorial (n) = n * factorial(n -1)

        if (n == 1) return 1;
        if (n == 0) return 1;

        //recursive
        return n * factorial(n - 1);
    }

    public static int pangkat(int a, int b){
        if (b == 0) return 1;
        return a * pangkat(a, b -1);
    }

    public static int fibonacci(int n){
        if (n == 1) return 1;
        if (n == 0) return 0;

        return fibonacci(n -1) + fibonacci(n -2);
    }

    // ini ecursive
    public static int fibonacci2(int n){
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++){
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        if (a == 0) return b;

        return gcd(b, a % b);
    }
    /**
     * menampilkan text sebanyak nilai ns
     * @param text
     * @param n
     */
    public static void print (String text, int n){
        if (n == 0) return;

        System.out.println(text);
        print(text, n -1);
    }
}
