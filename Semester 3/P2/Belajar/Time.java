public class Time {

    int hour;
    int minute;
    int second;

    // contructor default
    Time(){
    }

    // constructor mirip seperti method
    Time(int hour, int minute, int second){
        this.hour = hour; // this berfungsi untuk menginialisasi objek atau atribut
        this.minute = minute;
        this.second = second;
    }

    void printTime(){
        System.out.println("Waktu: " + hour + ":" + minute + ":" + second);
    }
}
