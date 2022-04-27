package day14_String;

public class OscarStringReview02 {

    public static void main(String[] args) {

        //length: it does not take parameter, it returns and integer number.

        String message = "EU8 is awesome!!";
        int count = message.length();
        System.out.println("how many characters we have: " + count);
        if (message.length() ==16) {
            System.out.println("happy testing");

        }

        System.out.println(message.toUpperCase());
        System.out.println("Message to uppercase");
        System.out.println(message);


        // Assign changes to a reference
        String messageTwo= message.toUpperCase();
        System.out.println(messageTwo);

        String str= " abc ";
        str = str.trim();
        System.out.println(str);

        // can we also trim the space inse the text

        String str2 = " abc def ";
        str2= str2.replace(" ", "");
        System.out.println(str2);

        String str3= " EU8 Awesome ";
        str3= str3.trim().replaceFirst(" ", ""); //  EU8Avesome
        System.out.println(str3);

        // QUESTION: can we trim and replace and do uppercase and substring in the same expression.
        // string methods chaining: possible YES

        String str4=  " EU8 Avesome ";
        str4= str4.trim().replaceFirst(" ", "").toUpperCase().substring(3);

        System.out.println(str4);


    }




}
