package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
        // index       01234
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);

        System.out.println("tenthChar= " + tenthChar);
        // if the index does not exist you will get out of range error

         */

        System.out.println("-------------------------------------");
        String s1 = "Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length(); // to get the total number of characters

        System.out.println("totalChars = " + totalChars);
        
        char lastChar = s1.charAt(s1. length() -1); //to find the last index number

        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------------");

        String str = "wooden spoon";
        str= str.toUpperCase(); //WOODEN SPOON
                                // upper case is a new string

        System.out.println(str);
        // today is a great day to learn java programming language.
        String sentence= "today is a great day to learn java programming language.";
        sentence.toUpperCase();
        sentence= sentence.toUpperCase();

        System.out.println(sentence);

    }
}
