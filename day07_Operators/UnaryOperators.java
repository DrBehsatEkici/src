package day07_Operators;

public class UnaryOperators {
    public static void main (String[] args)  {

        int num1 = +25;
        int num2 = -25;

        System.out.println("num1 = " + num1);

        int a = 5;
        ++a; // pre increment : increases the value by 1 right away

        --a; // pre decrement: decrease the value by 1 right away

        System.out.println(--a);
        System.out.println(++a);


        int b= 100;
        int c = 100;

        System.out.println(c++);// post increment :
        System.out.println(c);

        int x = 200;

        System.out.println(--x); //pre decrement

        int y = 200;

        System.out.println(y--); //post increment: first passes the current value, then decreases the value by 1
        System.out.println(y);

        int z= 45;

        System.out.println(++z); //46, z=46
        System.out.println(z++); //46, z = 47
        System.out.println(z); //47

        int q =30;
        System.out.println(--q); //29, q=29
        System.out.println(q--); //29, q = 28
        System.out.println(q); //28

    }

}
