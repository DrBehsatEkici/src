package week6_review;

public class PrintAllLetters {

    public static void main(String[] args) {

        // print all the letters from A to Z
        // Char A -- in ASCII table is value 65, Z is 60.
        // how can I turn integer into char: explicit casting

        int i = 65;
        for (; i <= 90; i++) {
            System.out.println((char) i + " ");

        }

        System.out.println("(char) i = " + i + " ");

        //for (int i = 65; i <=90 ; i++) {
        //  System.out.print ((char) i + " ");


        // chars are also iterable
        System.out.println();
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }

    }
}



