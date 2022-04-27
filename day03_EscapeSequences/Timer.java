package day03_EscapeSequences;

import java.util.Scanner;

public class Timer {
    public static void main (String [] args) throws InterruptedException {

        Scanner scan= new Scanner (System.in);

        System.out.println("Please enter the number of minutes");
        int minutes=scan.nextInt();
        scan.close();

        for (int i=minutes; i > 0;--i ) {
            if (i<0) {
                break;

            }

            for (int z=59; z>=0; --z) {
                System.out.print ("\r"+(i-1)+"minutes and "+z+" seconds left");
                Thread.sleep(1000); //pauses the execution of the code for given milli seconds
            }

        }

    System.out.println("\n\n");

    }


}
