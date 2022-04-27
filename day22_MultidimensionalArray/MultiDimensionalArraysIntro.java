package day22_MultidimensionalArray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"John", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Brenna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};


        String [][] groups= new String[3][]; //index: 0,1,2
        groups [0] = group1;
        groups [1] = group2;
        groups [2] = group3;

        //System.out.println(Arrays.toString(groups)); // to String is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups) );

        System.out.println("---------------------------------------------");

        // index of elements 0 1 2    0 1 2 3    0 1 2  3   4
         int [] [] arr2D= { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
        //index of arrays      0          1            2


        System.out.println(Arrays.deepToString(arr2D));

        // {4, 5, 6, 7}
        System.out.println(Arrays.toString(arr2D[1]));

        //11
        System.out.println(arr2D [2][3]);
    }

}

//String [] group1
// String [] group
// String [] group

// 2 dimensional array is the container for 1 dimensional array.