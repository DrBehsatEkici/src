package day06_PrimitiveTypeCasting;

import javax.lang.model.SourceVersion;

public class PrimitiveCastings {

    public static void main (String[] args)  {

        byte a= 100;
        short b= a;

        int c= b; //implicit casting

        // int c = (int) b

        double l= 2.5;
        float m = (float) l;

        System.out.println( l + ":" +m);

        double n= 10.8;
        int s = (int) n;

        System.out.println( n + ":" +s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println( d1 + ":" +s1);




    }

}
