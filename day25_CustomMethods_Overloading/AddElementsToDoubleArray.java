package day25_CustomMethods_Overloading;

import java.util.Arrays;
public class AddElementsToDoubleArray {

    public static void main(String[] args) {
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 5.5);

        System.out.println(Arrays.toString(arr2));

    }


    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
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