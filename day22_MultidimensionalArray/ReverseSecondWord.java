package day22_MultidimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I love Java";

        String [] words= sentence.split(" ");

        String reverse ="";

        for (int i= words [1].length()-1; i>=0; i--) {
            reverse += words [1]. charAt(i);

        }
        System.out.println(reverse);

        sentence= sentence.replaceFirst(words [1], reverse);

        words [1] = reverse;

        System.out.println(Arrays.toString(words));

        for (String word: words) {
            System.out.println(word +" ");
        }

        String result= "";
        for (String word : words) {
            result += word + " ";
        }

        System.out.println(result);

    }
}


// reverse word of the sentence