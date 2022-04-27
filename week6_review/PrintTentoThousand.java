package week6_review;

public class PrintTentoThousand {

    public static void main(String[] args) {

        /*

        question-1
        write a loop that displays the following set of numbers:

        0,10,20,30,40,............1000
        int i=0: initialization
        i<=1000: condition
        i+=10: iteration


         */

        for (int i = 0; i <=1000 ; i+=10) {
            System.out.print(i + " ");

        }
        System.out.println();

        //==================================================00
        // initialization
        int z= 0; //global variable for the whole class
        for(   ;z <=1000; ) {
            System.out.print(z+ " ");
            z +=10; // iteration

        }
        System.out.println("z = " + z);

        // difference if we make the initiatlization outside the for loop, the variable z can be use within the entire class.
        // or when the initialization is made within the for loop as usual, then the z only belongs to the loop.
    }

}
