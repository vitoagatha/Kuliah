import java.util.*;

public class Program {
    public static void main(String[] args) {

        // java class library
        // date 
        Date now = new Date();
        System.out.println(now);
        
        // date manual
        /*Date yesterday = new Date(119, 2, 11);
        System.out.println(yesterday);
        */

        // calendar
        Calendar c = new GregorianCalendar();
        Date now2 = c.getTime();
        System.out.println(now2);

        // calendar manual
        /*c.set(2019, GregorianCalendar.FEBRUARY, 21);
        Date yesterday2 = c.getTime();
        System.out.println(yesterday2);
        */

    }
}
