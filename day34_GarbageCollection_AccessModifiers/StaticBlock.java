package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("main method");

    }

    // static method gets executed first in java (in any class). Even before the main method.
    // it can run only once. It is not possible to run twice or more
    // static block does not have any name
    // you cannot call them.
    // if you have static variables do not use the main method to set them.
    // because you cannot run the main method outside its class.
    // main method cannot be executed automatically by itself.
    // static block can be executed outside its class automatically.
    // constructor is used for setting the insance variables
    // static block is used for settting the static variables

    static {
        System.out.println("Static Block1");

    }
    static {
        System.out.println("Static Block2");

    }
    static {
        System.out.println("Static Block3");

    }

}
