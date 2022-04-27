package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToStringArray {

    public static void main(String[] args) {
        String [] names = {"Tatiana", "Olexandr", "Cassandra", "Ali"}; // "Neira";
        names= addString (names, "Neira");
        names= addString (names, "Igor");

        System.out.println(Arrays.toString(names));

    }


    public static String [] addString(String[] array, String element) {
        String [] result = new String [array.length + 1];
        int i = 0;
        for (String each : array) {
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

3. create a return method called addString that can add a double after the last index of String array.

4. create a return method called addChar that can add a double after the last index of char array.
 */