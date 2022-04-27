package week6_review;

public class OddNumbers {

    public static void main(String[] args) {

        /*
        write a program that displays all od numbers between - and 130
        in the same line
         */
        for (int i = 3; i < 130; i += 2) {
            System.out.print(i + " ");

        }

        /*
        write a program that displays the numbers of even between 5 and 50 (included)
        I am asking How Many
         */
        System.out.println();
        int countOfEven=0;
        for (int i = 5; i <=50 ; i++) {
            if (i%2==0) {
                ++countOfEven;
            }

        }

        System.out.println("Count of Even numbers between 5 and 50= " +countOfEven);

      /*  int countofEven=0;
        for (int i = 4; i <=50 ; i+=2) {
            System.out.println(i + " ");

       */

        }
    }

