package day14_String;

import java.util.Scanner;

public class OscarFromReplit {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("please provide a valid email: craig_federighi@apple.com");
        String email= input.next();

        int indexof_= email.indexOf("_");
        int indexofAtSign = email.indexOf("@");
        int indexofDot= email.indexOf(".");

        String firstName= email.substring(0, indexof_);
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String lastName= email.substring(indexof_+1, indexofAtSign);
        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        
        String domainName= email.substring(indexofAtSign+1, indexofDot);
        System.out.println("domainName = " + domainName);
        

        // output: get the first name last name and domain from an email address.
        // First and last name with proper format. 
        //
        //

    }
}
