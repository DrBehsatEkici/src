package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str= "cccccccdddddaaaaaaabbbbb";
        str= removeDublicates(str);

        System.out.println(str);

    }

        // 1. create a method that can remove dublicated characters from a string and retuns a new value.

        public static String removeDublicates (String str) { // "aaabbcc" == >abc

        String result = "";
            for (int i = 0; i <str.length() ; i++) {
                char each = str.charAt(i);

                if (!result.contains(""+ each)){
                    result += each;
                }


            }

        return result;


    }

}
