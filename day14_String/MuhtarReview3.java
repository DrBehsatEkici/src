package day14_String;

public class MuhtarReview3 {
    public static void main(String[] args) {

        //isEmpty (): checks if the strings length is zero. retun type --> boolean

        String str = "  ";
        boolean r1= str.isEmpty();
        System.out.println(r1); //false, space is not empty

        System.out.println("--------------------");

        String str2 = "  ";
        boolean r2= str.isBlank();
        System.out.println(r2); // True

        System.out.println("--------------------");

        // equals (String ): compares the content of the two strings. retun type --> boolean
        // case sensitive

        String s1= "Java";
        String s2= new String ("Java");

        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // true

        // equalsIgnoreCase (String): compares the content of two strings irrespective of case senstitivity.
        // return type--> boolean.

        String word1 = "JAVA";
        String word2 = "java";

        System.out.println(word1.equals(word2)); // false
        System.out.println(word1.equalsIgnoreCase(word2)); // true


        // contains (String): checks if the given string is contained in the string. retrun type-->boolean

        String sentence= " I love Java Programming Language"; 
        boolean hasCSharp= sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);


        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);

        //startswith (string): checks if the string started with the given characters.
        // retun type -->boolean

        String name= "Wooden Spoon";
        boolean result1 = name.startsWith("Wood");
        System.out.println(result1); //true

        boolean result2= name.startsWith("Spoon");
        System.out.println(result2);

        //endswith (string): checks if the string ends with the given characters.
        // retun type -->boolean

        boolean result3= name.endsWith("Spoon");
        System.out.println(result3); //true


    }
}
