package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToCharArray {

    public static void main(String [] args) {
        char [] chars = {'A', 'B','C','D'}; // "Neira";
        chars= addchar(chars, 'E'); // A B C D E

        System.out.println(Arrays.toString(chars));

    }


    public static char [] addchar(char[] array, char element) {
        char [] result = new char [array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }


        result[i] = element;
        return result;

    }

}

/*

create a return method called addInteger that can add an integer after the last index of an integer array.

{1,2,3,4}, 5
new array ==> {1,2,3,4,5}

2. create a return method called addDouble that can add a double after the last index of double array.

3. create a return method called addchar that can add a double after the last index of char array.

4. create a return method called addChar that can add a double after the last index of char array.
 */