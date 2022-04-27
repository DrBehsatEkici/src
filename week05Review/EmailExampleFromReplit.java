package week05Review;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class EmailExampleFromReplit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a valid email: craig-federichi@apple.com");
        String email= input.next();

        int indexof_= email.indexOf("_");
        int indexofAtSign = email.indexOf ("@");
        int indexOfDot = email.indexOf(".");

        String firstname =email.substring (0, indexof_);
        firstname =firstname.substring(0,1).toUpperCase() +firstname.substring(1).toLowerCase();
        System.out.println("firstName =" + firstname);

        //String lastName=lastName.substring(0,1).
    }
}
