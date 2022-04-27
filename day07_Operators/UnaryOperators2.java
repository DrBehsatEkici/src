package day07_Operators;

public class UnaryOperators2 {

    public static void main(String[] args) {

        int a= -100;
        int b = +200;

        boolean aIsNegative = a<0;
        boolean bIsPositive = b>0;

        System.out.println("aIsNegative = " + aIsNegative);
        System.out.println("bIsPositive = " + bIsPositive);


        /// PRE INCREMENT AND DECREMENT

        // if you apply the pre increment it increases the value immediately
        // if you apply the pre-decremet it reduces the value immediatley

        int x= 10;
        System.out.println(++x); //11
        System.out.println(--x); //9

        // POST INCREMENT/DECREMENT

        int z= 20;
        System.out.println(z++); // 20:  old value of z is used in the first iteration /after the first case it increases the value by 1
        System.out.println(z); // 21 in the next stage the value is increased by 1;

        int q= 100;
        System.out.println(q--); //100 it will keep the original value in the first stage
        System.out.println(q); // it will increase the value by 1 in the next stage.


    }
}
