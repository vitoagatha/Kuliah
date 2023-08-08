public class VariablesAndNames {
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0; // hasilnya sama, atau yang membedakan pada saat mesin menyimpan/memproses tipe data tersebut
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers; // car - drivers untuk menghitung berapa mobil yang tidak di pakai 
        cars_driven = drivers; // mobil yang di pakai sesuai jmlah drivers
        carpool_capacity = cars_driven * space_in_a_car; // menghitung kapasitas penumpang dalam 1 mobil
        average_passengers_per_car = passengers / cars_driven; // menghitung rata rata penumpang setiap mobil 90/30 = 3


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
