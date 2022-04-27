package week6_review;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        /*
        noun: fibonacci sequence
        a series numbers in which each number (fibonacci number) is the sum of two preceding numbers. The simplest
        is series 1,1,2,3,5,8

        write a program series of n terms
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("What is the term number for Fibonacci series? : ");
        int n= scan.nextInt();
        int num1=0, num2=1;
        int sum;

        String series = " " + num1+ " "+ num2 + " ";

        for (int i = 2; i <=n ; i++) {
            sum= num1+num2;
            num1=num2;
            num2=sum;
            series+= sum+ " ";

        }
        System.out.println("series =" + series);
        System.out.println("Final number in the sequence is : " + num2);

    }
}
