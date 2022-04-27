package day20_Arrays;

public class MinNumberofArray {

    public static void main(String[] args) {
        int [] numbers = {100, 500, 30, 40, 600, 80, 90};

        int min =numbers [0]; //100 will compare it all the numbers and replace when there is a smaller number

        for (int i = 0; i < numbers.length; i++) {

            if (numbers [i] <min) {
                min = numbers [i];
            }

            System.out.println(min);

        }

    }
}
