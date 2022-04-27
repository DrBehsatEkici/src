package day15_ForLoops;

public class FINRA {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {  //i: 1, 2, 3, ................100

            if (i % 15 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");

            }


        }

    /*
    Write a method which prints out the numbers from 1 to 100 bur for the nımbers whch are multiple of both 3 and 5, print FINRA,
    instead of the number, for numbers which are a multiple of 3, print "FIN", instedad fo the number and
     for numbers which are multiple of 5, print "RA" insted of the number
     */


    }

}
