public class TipeDataBukanPrimitifDanArray {
    public static void main(String[] args) {
        Integer iniIntger = 100; //bukan primmitif
        Long iniLong = 1000L;

        Byte iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniLong.longValue();
        float iniFloat = iniObject.floatValue();

        String[] stringArray; //array
        stringArray = new String[3];

        stringArray[0] = "Vito";
        stringArray[1] = "Agatha";
        stringArray[2] = "Satritama";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama = { // inisialisasi array
            "Vito", "Agatha", "Satritama"
        };
        namaNama[0] = null;
        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };
        long[] arrayLong = {
            10L, 20L, 30L
        };
        arrayLong[0] = 0;

        System.out.println(arrayLong.length); //mengambil panjang array

        String[][] members = { //array di dalam array
                { "vito", "agatha"},
                { "budi", "herman"},
        };
        System.out.println(members[0][0]); //vito
        System.out.println(members[1][1]); //herman

    }
}
