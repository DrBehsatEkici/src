package day18_NestedLoops;

public class MuhtarReview {
    public static void main(String[] args) {

        //print 1-5 for 5 times
        // outer loop is repeating the inner loop

        for (int j = 0; j <= 5; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");

            }
            System.out.println(); //append a  new line after the execution of the inner loop.
        }

    }
}

