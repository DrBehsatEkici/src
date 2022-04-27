package week7_review;

public class TaskTwo {
    public static void main(String[] args) {

        /*

        write a Java program to print the following pattern

        1
        10
        101
        1010
        10101
        101010

        we have 6 rows, 6 columns
        patern: for odd colums print "1", for even columns "0"

         */
        for (int i = 1; i <=6 ; i++) { //handles rows

            for (int j = 1; j <=i ; j++) { // handles columns

                if ( j%2==1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);


                    //  System.out.print(j%2==1?1: 0); //ALTERNATIVE  // ternary operator
                }

            }
            System.out.println();

        }
    }
}
