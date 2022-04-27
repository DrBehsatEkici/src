package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names
        // smallest index number is zero. Index numbers cannot be negative.
        //data types must match. if you give string at the beginnning you should keep string

        String [] myGroup = new String [5]; // 0-4
        myGroup [0] = "Gunay";
        myGroup [1] = "Neira";
        myGroup [2] = "Suat";
        myGroup [3] = "Hulya";
        myGroup [4] = "Michael";

        System.out.println(Arrays.toString(myGroup)); // "Gunay, Neira, Suat, Hulya, Michael"

        System.out.println("---------------------------------------------------------");

        String [] days= {"Monday", "Tuesday", "Wednesday",  "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));
        int number =5;

        if (number <1 || number >7) {
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(days [number -1]); // accessing the index number of the day
    }


}

//BREAK 1: 05