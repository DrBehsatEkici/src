package week2Review;

public class ArithmeticOperators {

    public static void main (String[] args)  {
        
        /* 
        Division 
        *in math 10/3= 3.3333
        *in java 10/3= 3 reason int/int =int; 
        * 10/3.0 int / double =double
        * 10.0/3 double/int =double
        
         */


        System.out.println(10/3+ "+10/3)");
        System.out.println("10/3: " + (10/3));
        System.out.println("10/3.0: " + (10/3.0));
        System.out.println("10/3.0 : " + 10/3.0); // 3.0 = double data type 
        System.out.println("10+3: " + 10 + 3 ); // 10 + 3= 103 concatenation : string +int

        //which operations come first in JAVA
        // parentheses come first, division, multiplication is before concatenation

        //IMPORTANT : JAVA runs from top to botton and left to right



        
       int num1=10; 
       double num2= 3.0;
       
       
       double result = (int) (num1/num2); //explicit casting

        System.out.println("result = " + result);
        
        
       
                


        /*
         +: addition
         -:subtraction
         *: multiplication
         /: division
         %: remainder
         */


    }

}
