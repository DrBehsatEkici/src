package day14_String;

public class Oscar_reverseUsingCharAtMethod {

    public static void main(String[] args) {

        String word = "Madam";
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));

        String reversedWord = "";
        reversedWord +=word.charAt(4);
        reversedWord +=word.charAt(3);
        reversedWord +=word.charAt(2);
        reversedWord +=word.charAt(1);
        reversedWord +=word.charAt(0);

        if (word.equals(reversedWord)) {
            System.out.println("The Word is Palindrome");
           }else {
                System.out.println("The Word is not Palindrome");
                }
        }
    }

