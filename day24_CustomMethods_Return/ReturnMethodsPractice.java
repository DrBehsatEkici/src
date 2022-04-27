package day24_CustomMethods_Return;

public class ReturnMethodsPractice {
    public static void main(String[] args) {


        // find the max number between 100 & 200
        int maxNumber = max (100, 200);
        System.out.println(maxNumber);
    }



    // multiply the nmax number by 2
    // IN ORDER TO MAKE A SPECIFIC DATA RE-USABLE WE USE RETURN METHOD
    // PRINT STATEMENT IS ONLY FOR DISPLAY

    public static int max (int a, int b) {
        int result = 0;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

}

