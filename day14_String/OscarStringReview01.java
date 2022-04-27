package day14_String;

public class OscarStringReview01 {

    public static void main(String[] args) {



    String str1= "Java"; // literal way of creating string

    // string object is created in the HEAP memory, there is a special place called "string pool"

    String str2= "Java";

    System.out.println(str1== str2); // true: the reason: both str1 and str2 reference sare
                                      // pointing to the same object in the memory

    String str3= new String("Java"); // over here we are creating a totally new object.

   System.out.println(str1== str3);    // false, because str1 and str3 are pointing to different objects.

    // what does equals() method do? It is checking of the objects has the same value.

   System.out.println(str1.equals(str3));  // true

    String str4= new String("JAVA");

    // if you want to check without case sensitivity
     // equalsignorecase method

        System.out.println(str2.equalsIgnoreCase(str4)); // without case sensitivity

    }


}
