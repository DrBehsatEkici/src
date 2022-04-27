package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int min= 2000000000; // you should enter the maximum int, any number should be less than this

        for (int i = 10; i < 15; i++) {

            System.out.println("Enter a number");
            int num= scan.nextInt();

            if (num < min) {
                min = num;
            }
            System.out.println("min = " + min);
        }


    }
}
