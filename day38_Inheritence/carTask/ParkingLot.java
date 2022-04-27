package day38_Inheritence.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla = new Tesla ("Tesla", "Model S", 2022, 94500, "Red", 0);

        BMW bmw = new BMW ("BMW", "X5", 2020, 67350, "Black", 12000);

        toyota.start();
        tesla.start ();
        bmw.start();

    }
}
