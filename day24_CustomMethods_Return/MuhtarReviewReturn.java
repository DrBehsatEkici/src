package day24_CustomMethods_Return;

public class MuhtarReviewReturn {

    //return type of the method cannot be void

    public static void main(String[] args) {

        int total = sum(20, 40) * 3;
        System.out.println(sum(20,40)*3);


        System.out.println("---------------------------");
        String s1= reverse ("Wooden Spoon");
        System.out.println(s1);


        System.out.println("---------------------------");

        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Java"));


    }

    public static int sum(int num1, int num2) { // you can only print the value

        int result = num1 + num2;
        return result; // you have to return a value when you use custom method
    }

    public static String reverse(String str) {

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome (String str) {
        String reversed= reverse(str);
       return reversed.equalsIgnoreCase(str);
    }
}


