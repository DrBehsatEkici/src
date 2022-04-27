package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int max= -200000000; //max=1 //in order to find the max, you should always assign the smallest int

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num= scan.nextInt(); //1, 2, 3, 5, 1

            if (num>max) {  //if the user enteered a number greater than the current maximum number
                max=num;

            }

        }

        System.out.println("max = " + max);
        /*

  Write a program that asks user to enter a number for 5 times
  reutn the naximum number

  Write a program that asks user to enter a number for 5 times
  reutn the minimum number
         */
    }
}
