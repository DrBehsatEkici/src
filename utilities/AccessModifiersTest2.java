package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); //outside the package does not accept default modifiers.
        //System.out.println(AccessModifiers.privateData); does not accept private accessmodifiers

        AccessModifiers.method1();
        //AccessModifiers.method2(); does not accept default methods.
       // AccessModifiers.method2(); does not accept private methods.
    }
}
