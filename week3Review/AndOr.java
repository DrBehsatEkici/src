package week3Review;

public class AndOr {

    public static void main(String[] args) {

        int i1= 5;
        int i2 =10;

        System.out.println(true | false); //true, regular or operator checks both sides.
        System.out.println(true || false); // true again but does not check the second part of the statement, if the first part is already true.

        System.out.println(i2>i1 | i1>i2 ); // true
        System.out.println("i1 = " + i1);

        boolean a= i1<i2 && i2<i1; // true && false

    }

}
