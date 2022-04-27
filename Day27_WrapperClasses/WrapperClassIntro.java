package Day27_WrapperClasses;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int num1= 200;

        Integer n1=num1; //autoboxing, it is not implicit

        int num2=n1; //unboxing

        System.out.println("------------------");

        Integer integerValue=100; //after autoboxing you can convert the data type as long as it is within the range
        long longValue=integerValue;

        Byte b1=25;
        byte a1=b1;
        short a2= b1;
        long a4= b1;

        System.out.println("------------------");

        int num3= 200;
        //Long 12= num3; compile error
        // double d1= num3 compile error

        System.out.println("------------------");

        Integer z= 900; //you have a wrapper class but you dont have primive data.
        Integer y=z;

        System.out.println("------------------");

        int [] numbers1= {1,2,3,4,5};
        Integer [] numbers2= {1,2,3,4,5};



    }


}
