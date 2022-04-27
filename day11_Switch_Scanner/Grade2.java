package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'G';
        String result =""; 

        switch (ch) {

            case 'A' :
            case 'B' :
            case 'C' :
            case 'D' :
                result="Passed";
                break;
            case 'F' :
                result="Failed";
                break;

            default:
                result="Invalid";

        }
        System.out.println("result = " + result);
    }

    /*
    if the grade is A, B, C, D or D ===>passed
    otherwise ===>failed

     */
}
