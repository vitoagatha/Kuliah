import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int usiaAni = 15;
        int usiaBudi = usiaAni;
        usiaAni++;

        System.out.println("usiaAni = " + usiaAni);
        System.out.println("usiaBudi = " + usiaBudi);
        
        int[] usia1 = {15, 16, 17};
        //int[] usia2 = usia1;
        /* int[] usia2 = new int [usia1.length]; // mengcopy array
        for (int i = 0; i < usia1.length; i++) {
            usia2[1] = usia1[1]; 
        } */
        
        int[] usia2 = Arrays.copyOf(usia1, usia1.length);// copy

        usia2[0]++;


        System.out.println("usia[0] = " + usia1[0]);
        System.out.println("usia2[0] = " + usia2[0]);

        System.out.println("usia1 = " + Arrays.toString(usia1));
    }
}
