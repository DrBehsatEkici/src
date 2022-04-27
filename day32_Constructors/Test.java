package day32_Constructors;

import java.lang.reflect.Constructor;

public class Test {

    public Test () {
        System.out.print("Developer");

    }

    public void Test () {

        System.out.print("SDET");
    }



    public static void main(String[] args) {
        Test obj=new Test ();
    }
    }

