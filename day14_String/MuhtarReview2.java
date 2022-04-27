package day14_String;

public class MuhtarReview2 {

    public static void main(String[] args) {

        // replace (old Value, new value):  replaces all the matching characters of the string with the
        // given new characters. return type --->String

        String str1= "Wooden Spoon";
        str1= str1.replace("o", "e"); //weeden Speean

        System.out.println(str1);

        String sentence1 = " I love Java, Java is the best programming language";
        sentence1= sentence1.replace ("Java", "C#"); //

        sentence1.replace("C#", "Java");
        System.out.println(sentence1);


        System.out.println("-----------------------------------------");

        // replaceFrist (old value, new value): replaces the first matching characters of the string
        // with the given new characters. retun type -->

        String str2= "Wooden Spoon";
        str2= str2.replaceFirst("o", "e");
        System.out.println(str2);


        String sentence2= "I love Java, Java is the best programming language";
        sentence2= sentence2.replaceFirst("Java", "C#");
        System.out.println(sentence2);

        System.out.println("-----------------------------------------");
        //subString (beginningIndex): creates substring starting from the given beginning index to the end
        //of the string. retun type -->

        String str3= "Java Programming Language";

        String result1= str3.substring(str3.indexOf("P"));
        System.out.println(result1);

        // substring (beginIndex, endIndex): creates substring from the given beginning index to the given
        // ending index. retun type -->String
        // does not print the ending index

        String result2= str3.substring(5, 16);
        System.out.println(result2);

        String result3 = str3.substring(str3.indexOf("P"), str3.lastIndexOf("") );
        System.out.println(result3);

        String s1= "I love Java";
        String result4= s1.substring(2,6);
        System.out.println(result4);

        System.out.println("--------------------------------------------");

        // repeat (N) Repeats the String N number of times. retun type ---> String

        String str4= "Java";
        String r= str4.repeat(3);
        System.out.println(r);






    }
}
