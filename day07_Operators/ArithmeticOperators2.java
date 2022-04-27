package day07_Operators;

public class ArithmeticOperators2 {
    public static void main(String[] args) {

        //addition
        System.out.println(1000+2000);
        System.out.println(2.5+3.5);

        //subtraction
        System.out.println(100-30);
        int a= 300-100;
        System.out.println("a = " + a);

        //multiplication

        System.out.println(20*6);
        System.out.println(5.5*7);

        System.out.println(10/4); //2 -- in regular math it is 2.5 but integer value is 2
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println(10.0/4.0); //2.5

        System.out.println(20/6); //3
        System.out.println(20d/6); //3.333 adding "D" or "d" (double) TO the nominator or denominator YOU CAN GET decimals

        //remainder

        System.out.println(10%4); //2
        System.out.println(20/5); //
        System.out.println(20/6); //2


    }
}
