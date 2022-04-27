package day14_String;

public class MuhtarReview {

    public static void main(String[] args) {

        //charAt (int index) returns the cat at a given index, retun type ---> char

        String str= "Cydeo";
        // index:    01234

        //System.out.println(str.charAt(2));

        char ch1= str.charAt(2);
        System.out.println(ch1); //d

        System.out.println("-------------------------------------------------");

        // length (): returns the total number of characters. returns type -----> int
        // index number is always one unit less than the actual chars

        String str2= "Wooden Spoon";

        int n1= str2.length(); //total number of characters it is 1 more thant the index number
        System.out.println(n1);

        int lastIndex = str2.length() -1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-------------------------------------------------");

        // to lowerCase() retuns all the lower case version of the String. return page --->String

        String str3= "Java";
        str3= str3.toLowerCase(); // "java"
        System.out.println(str3);

        // to upperCase () retuns all the upper case version of the string. return type --->String
        String str4= "Java";
        str4.toUpperCase(); //JAVA
        System.out.println(str4);

        System.out.println("-------------------------------------------------");

        // trim (): retuns the String without all the white spaces (unused spaces)
        // before and at the end NOT in the middle .
        String str5 = "  Java Programming Language ";
        str5= str5.trim(); // "Java Programming Language"; Space before and at the end.
                           // the space between the words is not perceives as a space so trim does not take them.

        System.out.println(str5);

        System.out.println("-------------------------------------------------");

        // indexOf () retuns the first matching character index number return page ---> int
        String str6= "Wooden Spoon";
        int indexNumOfFirstO= str6.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);

        int indexNumberOfSecondO = str6.indexOf("od");
        System.out.println("indexNumberOfSecondO = " + indexNumberOfSecondO);

        int indexNumOfThirdO= str6.indexOf("po")+1;
//      int indexNumOfThirdO= str6.indexOf("oon")+1; // alternative
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);

        System.out.println("-------------------------------------------------");

        // last index of () retuns the last matching characters index number. retun type -->int 

        String str7= "Wooden Spoon"; 
        
        int indexNumberOfLastO= str7.lastIndexOf("o");
        System.out.println("indexNumberOfLastO = " + indexNumberOfLastO);


    }

}
