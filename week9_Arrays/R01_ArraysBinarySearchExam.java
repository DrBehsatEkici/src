package week9_Arrays;

import java.util.Arrays;

public class R01_ArraysBinarySearchExam {

    public static void main(String[] args) {

        int [] nums = {-5, 23, 123, 654, 2344, 12345, 14421};

        int indexOne= Arrays.binarySearch(nums, 23);

        System.out.println("indexOne= " + indexOne);

        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 25));

        if (Arrays.binarySearch(nums, 12345) >= 0){
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12346 is not in the list");
        }

        int [] numsTwo= { 56, 3, -67, 100, 75};

        // COMPLETE THIS TOPIC



    }
}
