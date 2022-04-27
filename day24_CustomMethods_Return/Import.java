package day24_CustomMethods_Return;

    import day24_CustomMethods_Return.ReturnMethodPractice4;
    import jdk.swing.interop.SwingInterOpUtils;

    import java.sql.SQLOutput;

public class Import {

    public static void main(String[] args) {

        String str= "aaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";

        str=ReturnMethodPractice4.removeDublicates (str);

        System.out.println(str);

        String name= "Java Programming";

       String reversedName= ReturnMethodsIntro.reverse(name);

        System.out.println(reversedName);


    }
}
