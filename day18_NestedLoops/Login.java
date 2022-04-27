package day18_NestedLoops;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String u= scan.next();

        System.out.println("Enter your password: ");
        String p= scan.next();

        if (u.equals("Cydeo") && p.equals ("WoodenSpoon")) {
            System.out.println("Logged in");

        }else {

            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username: ");
                u= scan.next();
                System.out.println("Enter your password: ");
                p= scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    break;

                }
                }
                if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
               System.out.println("Your account is locked, Please contact support team");
                }

            }

        }



        //username: Cydeo
        //password: WoodenSpoon
        //three attempts,
    }

