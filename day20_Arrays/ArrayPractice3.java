package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("How many numbers would you like to enter");
        int length = scanner.nextInt(); //10
        if (length <=0) {
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        int [] numbers = new int[length]; // [0,0,0,0,0] Length is indicating the size of the array [5]
                        //array needs to have enough capacity to contain all the elements user goint to enter
        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
            numbers [i] = scanner.nextInt(); //5 assigning user entered numbers
            //each input user provided ruing each execution of the loop, will be assigned to the indexes of the array


            
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();

    }
}
