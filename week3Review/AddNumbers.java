package week3Review;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {


        double num1 = 5.5;
        double num2 = 3.3;
        double num3 = 6.4;
        double num4 = 5.3;


        double total = num1 + num2 + num3 + num4;

        System.out.println("total= " + total);


    }
    {
    System.out.println("--------------------------------------");

    Scanner scan = new Scanner(System.in);

    double num1, num2, num3, num4, total;

    System.out.println("Enter 4 numbers");

    num1= scan.nextDouble();
        System.out.println("num1 = " + num1);
    num2 = scan.nextDouble();
        System.out.println("num2 = " + num2);
   num3 = scan.nextDouble();
        System.out.println("num3 = " + num3);
   num4= scan.nextDouble();
        System.out.println("num4 = " + num4);

    total = num1+ num2+ num3+ num4;
        System.out.println("total = " + total);

}



    }


