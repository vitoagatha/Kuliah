public class Hello {
    public static void main (String[] args){
        System.out.println("Hello World!");
        sayHello("Ani");
        perulangan(6);
        perulanganISampaiJ(50, 100);
        halo();
    }

    public static void sayHello(String nama){
        System.out.println("Hello " + nama);
    }
    public static void perulangan (int m){
        for (int n = 1; n <= m; n++){
            System.out.println(n);
        }
    }
    public static void perulanganISampaiJ(int i, int j){
        for (int h = i; h <= j; h++){
            System.out.println(h);
        }
    }
    public static void halo(){
        System.out.println("helo");
    }
}
