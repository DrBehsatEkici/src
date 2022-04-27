package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] nums= {1,2,3,4,5};

        System.out.println(nums); // we have to have toString to print int arrays.
        System.out.println(Arrays.toString(nums)); // explicitly calling the toString method

        System.out.println(nums [0]); //it is an element in Array, you can print it. it is an int

        System.out.println("----------------------------------------------------");

        int [] scores = {95, 100, 55, 65, 85, 78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score:" +scores [0]);
        System.out.println("Max Score." +scores [scores.length-1]);

        System.out.println("----------------------------------------------------");


        String [] names= {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------------------------");

        String [] words = {"Anna", "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); //ANNA, Anna, upper case prints first

        System.out.println("----------------------------------------------------");

        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};

        boolean r1= Arrays.equals(arr1, arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2= Arrays.equals(arr1, arr2);
        System.out.println(r2);

        System.out.println("----------------------------------------------------");

        // abc, bac// ANOGRAM: composed of the same letters.
        char [] ch1 = {'a', 'c', 'b'};
        char [] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //abc
        Arrays.sort(ch2); //abc

        boolean anagram= Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);

        System.out.println("----------------------------------------------------");



        /*
        toString (): converts the array objects (single dimensional) to string then you will be able to print it out.
        but the Elements, you can directly print.
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());

         */


    }

}
