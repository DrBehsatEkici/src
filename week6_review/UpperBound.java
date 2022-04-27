package week6_review;

import java.util.Scanner;

public class UpperBound {

    public static void main(String[] args) {

        // FOR LOOP is repeatable if statement
        /*
        Write a program to calculate the sum of all the numbers from 1 till upper bound
        if upper bound is 5, sum should be 1+2+3+4+5=15
        if upper bound is 11, sum should be 1+2+3..........11=66
        if upper bound is 100, sum should be 1+2+3..........100=5050
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a valid upper bound: ");
        int upperBound = scan.nextInt();

        int sum=0;
        boolean check=true;
        for (;check; ) {

            if (upperBound >= 1) {
                for (int i = 1; i <= upperBound; i++) {
                    sum += i;
                }
                check = false;
            } else {
                System.out.println("Please Enter a Valid Number Again: ");
                upperBound= scan.nextInt();
                check=true;
            }
        }
        System.out.println("sum = " + sum);
    }

}
