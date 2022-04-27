package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26]; //z to a, reverse index


       // for (char i = 0, j = 'Z'; i < alphabets.length; i++, j--) ; //for loops with two variables
        //alphabets[i] = j;

    // Create the loop with one variable //ONOTHER WAY

        char ch = 'Z';
        for( int i = 0; i<alphabets.length;i++,ch--)

        alphabets[i] = ch;

        System.out.println(Arrays.toString(alphabets)); // print the whole array


    }

}


        /*
        alphabets [0] = 'Z'; //ASCII TABLE 90
        alphabets [1] = 'Y'; //ASCII TABLE 90
        alphabets [2] = 'X'; //ASCII TABLE 90


         */
       // System.out.println(Arrays.toString(alphabets)); // print the whole array
       // System.out.println(alphabets [0]); // printing the element of array




