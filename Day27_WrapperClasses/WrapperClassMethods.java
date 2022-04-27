package Day27_WrapperClasses;

import java.sql.SQLOutput;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str= "123"; //To return string to int we use PARSE method

        int num= Integer.parseInt(str); //int

        System.out.println(num+1); //124
        System.out.println(str+1); //1231

        String str2= "10.5";

        double num2= Double.parseDouble(str2); // double

        System.out.println(num2+1);  //11.5

        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
        long max2= Long.MAX_VALUE; 
        long min2= Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1= "True";
        boolean r1= Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("---------------------------------");

        String s2= "123";
        Integer x= Integer.valueOf(s2);//integer //VALUE OF returns you wrapper clas
        int y= Integer.valueOf(s2); //integer

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        double z= Double.valueOf(s3);

        System.out.println(z);

        System.out.println("---------------------------------");


        char ch1= '0';

        //isDigit ()
        boolean r2= Character.isDigit(ch1);

        //isLetter ()
        boolean r3= Character.isLetter(ch1);

        //special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        //upperCase
        boolean r5= Character.isUpperCase(ch1);

        //loverCase
        boolean r6= Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("---------------------------------");

        String s= "ab1cde2fg3hi4";

        int sum =0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
             
            }

        }

        System.out.println("sum = " + sum);
    }


}
