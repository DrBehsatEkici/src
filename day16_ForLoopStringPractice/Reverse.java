package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str= "Wooden Spoon";
        // index:    0123456789...

        String result = "";

        for (int i = str.length()-1;  i>=0; i--) { //: index number of str (staarting last index to index 0
            result+= str.charAt(i); // adding each chracter to result

            System.out.println(result);

        }
        /*


        write a prograam that can reverse a string

        input:wooden spoon

        output: noops needow
         */
    }
}
