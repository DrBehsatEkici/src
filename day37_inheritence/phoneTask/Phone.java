package day37_inheritence.phoneTask;

public class Phone { //parent class only contains the common features of all the sub classes.

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery= true; // this is applicable to all models so it can be STATIC.

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call (long phoneNumber) {
        System.out.println(brand + " " +model + " is calling" + phoneNumber);
    }

    public void text (long phoneNumber) {
        System.out.println(brand + " " +model + " is texting" + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $ " + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }

    // you cannot make STATIC because not all the phones have the same characteristics.
    // soo it should be instance model
}
