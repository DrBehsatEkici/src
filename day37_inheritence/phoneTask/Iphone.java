package day37_inheritence.phoneTask;

public class Iphone extends Phone {

    // right click generate, constructor
    public Iphone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void facetime (long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a face time with phone number: " + phoneNumber);
    }

    public void facetime (String email){
        System.out.println(brand + " " + model + " " + " is having a face time with email: " + email);
    }
}
