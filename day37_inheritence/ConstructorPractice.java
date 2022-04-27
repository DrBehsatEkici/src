package day37_inheritence;



    class A {
        public A (int a) {
            System.out.println("A");
        }
    }

    class B extends A {
        public B () { // constructor calls the super keyword (parent class) implicitly
            super (9);
            System.out.println("B");
        }
    }

    public class ConstructorPractice {

        public static void main(String[] args) {

            B obj = new B ();

            // 2:08

        }
    }




