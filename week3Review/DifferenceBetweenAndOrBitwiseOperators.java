package week3Review;

public class DifferenceBetweenAndOrBitwiseOperators {

    public static void main(String[] args) {

        int i1= 5;
        int i2= 10;

        System.out.println(true|false); //true
        System.out.println(true||false); //true again, but does not check the second part of the statement

        System.out.println(i2>i1 | i1>i1); // true

        System.out.println(i2>i1 || ++i1>i1);
        System.out.println("i1 = " + i1); //
        
        // "|" or checks the both sides of the operators
        // "||" bitwise or does not check the otherside of the operators if the firt part meet the condition
        
        boolean a= i1<i2 && i2<i1; // Bitsise and operator if the first part is false it does not check
        // the second part of the statement
        System.out.println("a = " + a);
        
    }
}
