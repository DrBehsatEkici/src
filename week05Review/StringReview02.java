package week05Review;

import javax.lang.model.SourceVersion;

public class StringReview02 {

    public static void main(String[] args) {

        /*
    length (): it does not take parameter, it returns an integer number

     */
        String message = "EU8 is Awesome!!";
        int count = message.length();
        System.out.println("how many characters we have : " + count);
        System.out.println(count==16);
        System.out.println(message.length () ==16) ;

        if (message.length () ==16) {

            System.out.println("happy testing");
        }

        System.out.println(message.toUpperCase());
        System.out.println("message after uppercase");
        System.out.println("message");

        message =message.toUpperCase();
        System.out.println("count = " + count);

        String messageTwo = message.toUpperCase();
        System.out.println(messageTwo);

        String str= " abc ";
        str= str.trim();
        System.out.println(str.trim() );

        String str2 = " abc cde ";
        str2 = str2.replaceAll(" ", "");
        System.out.println(str2);

        String str3 = " EU8 Awesome";
        str3= str3.trim ().replaceFirst(" ", "");
        System.out.println(str3);

        //  can we trim and replace and do uppercase and substring in the same expression?
        // Sstring methods chaining:

        String str4 = " EU8 Awesome";
        str4= str4.trim(). replaceFirst(" ", "").toUpperCase().substring(3);
        System.out.println(str4);



    }






}
