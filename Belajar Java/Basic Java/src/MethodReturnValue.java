public class MethodReturnValue {
    public static void main(String[] args) {

        var hasil1 = sum(100, 100);
        System.out.println(hasil1);

    }

    static int sum(int nilai1, int nilai2){
        var total = nilai1 + nilai2;
        return total;
    }
}
