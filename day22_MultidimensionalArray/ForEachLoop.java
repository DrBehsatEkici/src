package day22_MultidimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // index of elements 0 1 2    0 1 2 3    0 1 2  3   4
        int [] [] arr2D= { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
        //index of arrays      0          1            2

        /*
        for (int [] each1DArray: arr2D) {

           for (int eachElement:each1DArray) {
               System.out.print(eachElement + " ");
           }
        System.out.println("-----------------------------");
        // FOR EACH LOOP YOU CANNOT CHANGE THE ORDER. YOU ONLY GET FROM BEGINNING TO THE END.

         */
           for ( int [] each1DArray: arr2D) {
               for (int eachElement:each1DArray) {
                   System.out.print(eachElement + " ");
               }
           }
        }

    }
