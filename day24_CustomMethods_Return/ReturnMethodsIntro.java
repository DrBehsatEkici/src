package day24_CustomMethods_Return;

public class ReturnMethodsIntro {

    public static void main(String[] args) {

        // if it is a multiple different steps which you want them
        // to be applicable somewhere else you need to create a method
        // ONCE YOU CREATE A RETURN METHOD IT BECOMES MANDATORY FOR YOU TO RETUrN A VALUE
        // RETURN MAKES THE VALUE RE-USABLE

        String str = "Java";
        String result = reverse(str);
        System.out.println(result);

    }

    public static String reverse(String str) { //"Java"
        String reverse = " ";

        for (int i = str.length()- 1; i >= 0; i--) {
            reverse += str.charAt(i);


        }

       return reverse;

    }




    }



