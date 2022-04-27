package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); //Wooden Spoon

        System.out.println("Enter your building number: ");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String street= scan.nextLine();

        System.out.println("Enter your city name: ");
        String City = scan.nextLine();

        System.out.println("Enter your state name: ");
        String State = scan.next();

        System.out.println("Enter your zipcode: ");
        String zipcode = scan.next();

        scan.nextLine();

        System.out.println("Enter your country name: ");
        String country= scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("City = " + City);
        System.out.println("State = " + State);
        System.out.println("zipcode = " + zipcode);
        System.out.println("country = " + country);

        scan.close();

                /*
                1. Enter your full name
                2. Enter your building number
                3. Street name
                4. City name
                5. State
                6. Zipcode

                Display the shipping address

                 */
    }
}
