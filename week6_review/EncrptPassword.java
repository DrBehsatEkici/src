package week6_review;

import day15_ForLoops.ForLoopIntro;

public class EncrptPassword {

    public static void main(String[] args) {

        /*

        Given a string password. Ecrypt with "x a given password
        and print
        do with for loop
        password: cydeo
        encrypt with char:x
        output: cxyxdxexox
         */

        String password = "cydeo";

        char encryptWithChar= 'x';

        String encryptedPassword = "";

        for (int i = 0; i <password.length() ; i++) {
            // i stands for index of password string

            encryptedPassword += "" + password.charAt(i)+encryptWithChar; // string + char + char= string

        }
        System.out.println("encryptedPassword = " + encryptedPassword);
    }
}
