package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice6 {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        input.nextLine(); //Enter
        System.out.println("Enter your full name");
        String fullName= input.nextLine(); // Enter

        System.out.println("score = " + score);
        System.out.println("fullName = " + fullName);

        //Whenever you use nextline after other methods, you have to empty the scanners memory. we put input.nextline();
        // if you are using nextline method after another nextline you dont have to do it.

    }
}
