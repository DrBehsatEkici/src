package day34_GarbageCollection_AccessModifiers;

public class Constructor_Vs_StaticBlock {

    static {
        System.out.println("Static Block");
    }

    public Constructor_Vs_StaticBlock () {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
       new Constructor_Vs_StaticBlock();
       new Constructor_Vs_StaticBlock();
       new Constructor_Vs_StaticBlock();
       new Constructor_Vs_StaticBlock();
       new Constructor_Vs_StaticBlock();

    }
}
// first static block gets executed. Static variable is the COMMON property of all the objects. Executed only one time.
// constructor will be executed after the objects are created. Constructor is executed for each of the object.
// then main method will be executed.
// main method is not going to run by itself outside the classes.
// you should never use constructor to set static variables.