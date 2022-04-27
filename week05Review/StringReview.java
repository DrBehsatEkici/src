package week05Review;

public class StringReview {

    public static void main(String[] args) {

        String str1= "Java";

        // string object is created in the HEAP memory, there is a special place called "String Pool"

        String str2= "Java"; //literal

        System.out.println(str1== str2); // true: THE REASON: BOTH str1 and str2 refers to the same object in the memory.

        String str3 = new String ("Java"); // over here we are creating a totally new object.

        System.out.println(str1== str3); // false, the reason: str1 and str3 are pointing to different objects.

        System.out.println((str1.equals(str3))); //true

        String str4= new String ("JAVA");
        // if you want to check without case sensitivity
        //equals ignore case

        System.out.println(str2.equalsIgnoreCase(str4)); //true


    }
}
