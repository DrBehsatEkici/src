package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next (); //java
        
        System.out.println("Enter your last name");
        String lastName = scan.next ();
        
        char f= firstName.charAt(0);
        char l= lastName.charAt(0);
        
        String initial = ""+ f + "." + l + ".";  // to be able to do concatenation there must be a string on the left or right
                                            // as long as there is a quotation marks you are fine.

        System.out.println("initial = " + initial);

        scan.close();


    }
}
