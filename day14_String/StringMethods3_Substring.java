package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {


        String word= "Cydeo School"; //Whenever you want to get some portion of the string use substring
        //            0123456.....
        // want to give the "cydeo" portion of the string.

        String brand= word.substring(0, 4+1); // 4 was not inclued, stops just before the second number

        System.out.println(brand);

        String str1 = word.substring(6); //if it is until the end of the string you dont need to give the ending index

        System.out.println(str1);

        System.out.println("-----------------------------------");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0,  word2.indexOf(" ")); //"Java"
        String s2 = word2.substring( word2.indexOf(" ")+1,  word2.lastIndexOf(" ")); // "Programming"
        String s3 = word2.substring( word2.lastIndexOf( " ") +1 ); //"Language"


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-----------------------------------");

        String word3 = "Python C# Ruby";

        String ss1 = word3.substring(0,  word3.indexOf(" ")); //"Python"
        String ss2 = word3.substring( word3.indexOf(" ")+1,  word3.lastIndexOf(" ")); // "C#"
        String ss3 = word3.substring( word3.lastIndexOf( " ") +1 ); //"Ruby"


        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);


    }
}
