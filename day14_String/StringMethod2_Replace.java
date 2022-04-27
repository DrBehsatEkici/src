package day14_String;

public class StringMethod2_Replace {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 =str.replace ("Java", "Python"); // New String object
                                   //Python is fun, I love learning Python


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("---------------------------------");

        String email= "JohnSmith@yahoo.com";
        email= email.replace ("yahoo", "gmail"); //creates a new string JohnSmith@gmail.com
        System.out.println("email = " + email);

        System.out.println("---------------------------------");

        String sentence = "java java Python Python C# C# C# C++ C++ Python Python Python Python ";
        String sentence2=  sentence.replace ("Python ", "");
                sentence2= sentence2.replace ("   ", " ");
        // "Java Java C# C# C++ C++"
        System.out.println("sentence2 = " + sentence2);

        System.out.println("---------------------------------");

        String s= "dog dog dog dog dog dog dog";
        s= s.replace("dog", "Cat"); // you need to assign it back to the original variable

        System.out.println("s = " + s);
        
        String s2 = "C# is fun, C# is cool"; 
        s2= s2.replace("C#", "Java");
        System.out.println("s2 = " + s2);


        String s3 = "Java";
        s3 = s3.replace("a", "e");

        String result = "java java java";
        result = result.replaceFirst("java", "Python"); // it only replaces the first java
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool" ;
        result2= result2.replaceFirst("C#", "Java");

        System.out.println("result2 = " + result2);

        String result3= "Java"; 
        result3 = result3.replaceFirst("va", "vo"); // if I want to replace the second "a"

        System.out.println("result3 = " + result3);




    }
}
