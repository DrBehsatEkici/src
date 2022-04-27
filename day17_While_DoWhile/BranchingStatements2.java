package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if (i== 'C') { // continue is used for skipping, C is skipped.
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------------------");

        //print all odd numbers  between 1-10 (skip the even numbers)
        for (int i=1; i<11; i++) {
            if (i%2 !=0 ) { //// this  is the condition if the number is odd
                continue; //skip (all the odd numbers are skipped)

            }
                System.out.println(i);
            }

        System.out.println("-----------------------------------------------");

        // print all odd numbers between 1-10 (skip the even numbers)

        for (int i = 0; i <11 ; i++) {
            if (i%2==0) { // this  is the condition if the number is even

                continue;
            }
        System.out.println(i);
        }

        }



    }

