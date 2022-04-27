package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str= "aaabccc";
        //           0123456
        String result = "";

        for (int i = 0; i < str.length() ; i++) { // i: index numbers of the str starting rom 0)
            char ch = str.charAt(i);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            result += ch;
        }
        }
        System.out.println("result = " + result);

        char ch = 'b';
        if(str.indexOf('a') == str.lastIndexOf('a')) {  // if the first and last index numbers of the character are same, then it must be a unique chracter.
            result += 'b';

        }

        System.out.println("result = " + result);
    }
}
