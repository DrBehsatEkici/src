package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: "); // for age we use nextint
        int age= scan.nextInt();

        System.out.println("Enter your gender: "); //reads one word until the space
        String gender = scan.next();

        scan.nextLine(); //reads the entire line
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); //if the previous scanner method that is used is not nextLine (),
                                           // then we need additional nextLine statement

        System.out.println("Enter your phone number: ");
        long phone = scan.nextLong ();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city = scan.nextLine ();

        System.out.println("Enter your state name: " );
        String state = scan.nextLine ();

        System.out.println("Enter your building number: " );
        int buildingNum= scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street name: " );
        String street = scan.nextLine ();

        scan.close();

        System.out.println("Full Name:  " + fullName);
        System.out.println("Age:  " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phone);
        System.out.println("Address:  \n\t "+ buildingNum+" "+street+" \n\t "+city+", "+state+" "+zipCode);
        System.out.println("School Name:  = " + schoolName);

    }

}
