package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // outer class, it cannot be static.

    int a;

    class class1 { // inner class, it can be static. it has to be a nested class to be static.

    }

    public static int num = 100;

    public static void method() {

    }

    static {

    }

}

    class A { // outer class

        static class B { // inner class
            public static void method1 () {

            }

        }

    }

    class C {
        public static void main(String[] args) {
            A.B.method1();

        }
    }
    // in java you can make a STATIC class, inside the nested methods.
// only the inner class can be static.

class x {

}
class y {

}

class z {

    static class q { // only q can be static.

    }

}


