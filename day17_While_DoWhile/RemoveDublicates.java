package day17_While_DoWhile;

public class RemoveDublicates {

    public static void main(String[] args) {

        String str= "AABBCC";

        String result = ""; //AB

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i); // A A B B C C
            if (result.contains("" + ch)) {  // if the result already contains the result the character skips
                // contains method is only used for String data type,
                continue; //skip the iteration
            }
            result += ch;

        }

        System.out.println(result);
    }
}
