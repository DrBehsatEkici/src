package day38_Inheritence.carTask;

public class Toyota extends Car {

    public Toyota(String brand, String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable () {
        System.out.println(brand + " " + model + " is reliable");
    }

    @Override
    public void start () {
        System.out.println("Twist the key to ignition to start" +brand + " Camry");

    }


    // only a constructor can call another constructor
    // only time you will have to pass a parameter is when there is unknown information.
    // for overriding parameters must be same
    // access modifiers from more accessible to less accessible==> public, protected, default, private

}
