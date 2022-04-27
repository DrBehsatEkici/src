package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

    String str = "Cydeo12345School!@&%WoodenSpoon";

    String digits = "";
    String letters = ""; //
    String specialChars = ""; // !@

    for (int i= 0; i< str.length (); i++) {

        char ch = str.charAt(i);

        if (ch >= '0' && ch <= '9') { // if the character is between '0' to '9' than it is a digit
            digits += ch;
        } else if (ch >= 'A' && ch <= 'Z') { // if the character is between 'A' to 'Z' than it is a letter
            letters += ch;
        } else if (ch >= 'a' && ch <= 'A') { // if the character is between 'a' to 'z' than it is a letter
            letters += ch;
        } else {  // if the character is neither digit nor letter, then its a special character
            if (ch != ' ') {



            specialChars += ch;
            }
        }
    }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }







    }


