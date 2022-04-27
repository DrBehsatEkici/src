package day14_String;

public class StringMethods1_IndexOf {

    public static void main(String[] args) {

        String str1= "     batch 25   "; // spaces are included in the string. when you trim it is a different string
        str1 =str1.trim (); //batch 25 // you have to assign it back once you trim.
                            // it will give you "batch 25" once you assign it back.

        System.out.println(str1);

        //---------------------------------------------
        // Index number

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        //int n2= str2.indexOf("o"); // turns the first "o"
        //        System.out.println("n2 = " + n2); //4
        // System looks from the LEFT to the right.

        int n2= str2.indexOf("ool"); // turns the first "o"
        System.out.println("n2 = " + n2); //9



        //-------------------------------------
        String str3 = "Java Programming Language";
        int n3= str3.indexOf("an");

        // String str3 = "Java Programming Language";
        // int n3= str3.indexOf("a "); //3, there is space after the a which makes it unique

        System.out.println("n3 = " + n3);

        int n4= str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        // last index of look for the character from the RIGHT side of the string.
        //--------------------------------
        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("------------------------------------");

        String s= "Java Nova Cava Wawa orange";
        int firstA= s.indexOf("a"); // if you are looking for the first time use indexOf (LEFT to right)
        int lastA= s.lastIndexOf("a"); // RIGHT to left
        int secondA =s.indexOf("a "); 
        int thirdA = s.indexOf("a C");
        //int fourthA= s.indexOf("ava W");
        //int fourthA =s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") +1; //originally it gives C but adding one you get the fourth "a"
        int fifthA = s.lastIndexOf("a W");
        int sixthA= s.lastIndexOf("aw");
        int seventhA= s.lastIndexOf("a o");
        
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }

}
