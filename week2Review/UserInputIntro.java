package week2Review;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {

        String name= ""; // hard coded way
        System.out.println("Output");
        // how can I receive input for my JAVA class


        //. 1. create your scanner object (object name can be anything)
        Scanner input = new Scanner(System.in);

        //.2. prompt the user for putting input
        System.out.println("Put your name: "); // this is printed out to console

        //3.get the input

        name= input.next(); // reads the data from console and assigns the value to my variables

        System.out.println("name = " + name);

        //Step 1 and 3 are must, but steps 2 and 4 depends on the situation
        // scanner class should be placed at the top of the class




    }
}
