package week9_Arrays;

import java.util.Arrays;

public class R02_Biggestin2DArray {

    public static void main(String[] args) {

        int [] [] arr = {{ 3, 12, 3, 34, 12}, { 13,7, 456, 34, 3}, {-5, -24, -2, -10, -4}};

        // I want to print this 2D Array at the console

        System.out.println(Arrays.toString(arr));
        int [] biggestNumber = new int [arr.length];

        // arr. length the size of 20 array

        for (int i = 0; i < arr.length; i++) {

            int max= arr [i] [0]; // this statement means first element of each array at index

        }
    }
}
