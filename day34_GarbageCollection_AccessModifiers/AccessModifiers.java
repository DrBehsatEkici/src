package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData=100;

    static int defaultData=200;

    private static int privateData =300;

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
        public static void method1() {
            System.out.println("public");
        }

        static void method2() { //this is a default access modifier.
        System.out.println("default");
    }

        private static void method3() {
         System.out.println("private");
    }

    // when you do not use access modifiers it is default.
    // java file name has to match with the access modifiers. You should not change the public files to others.
}
