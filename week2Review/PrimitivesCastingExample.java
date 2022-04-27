package week2Review;

public class PrimitivesCastingExample {
    public static void main (String[] args)  {

        byte num1;   //declaring a variable
        num1= 123;   //initializing a variable (assigning a value)
        num1= 121; // re-assign the value
        short num2=12354; //declare and initialize at the same time
        int distance =1_000_000_000;
        long distanceMore=3_000_000_000L; // we have to put L to define the variable
        long distanceShorter = 1_000_000_000; // if it does not pass the limit then we don't have to give

        float rate = 1000.5F;
        double dNumber = 123.6;

        System.out.println("-----Casting_---");
        System.out.println("Before Swapping values");
    
        num2= num1; 
        System.out.println("dNumber = " + dNumber);


        System.out.println("Explicit casting of floating points"); 
        short rateTwo= (short) rate;
        System.out.println("rateTwo = " + rateTwo);

        


    }

}

