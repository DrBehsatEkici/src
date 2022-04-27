package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaacc";
        String result = ""; // abc
                // i<=7 ===> i<8

        for (int i = 0; i <= str.length() -1 ; i++) { //i: represents all the index numbers of str (start from 0)
        String ch = "" + str.charAt(i); // represents each character of str

        if (!result.contains (ch)) { // if the character is not contained in the result
            result += ch; // the character will be added to the result
        }


        }

        System.out.println(result); // dont give the print statment in the loops
    }

}
