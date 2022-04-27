package day10_NestedIfStatement;

public class GradeReport {

    public static void main(String[] args) {

        /*

        90-100: Excellent
        80-89: Great
        70-79: Good
        60-69: Passed
        0-59: Failed
         */

        int score = 99;

        if (score >= 0 && score <= 100) {

            //5 possibilities : A, B, C, D, E,F
            System.out.println("score = " + score);
            if (score >=90 && score <=100) {
                System.out.println("Excellent"); // false : <90
            } else if (score >=80 && score <=89) {
                System.out.println("Great"); // false : <80
            }else if (score >=70 && score <=79) {
                System.out.println("Good"); // false : <70
            } else if (score >=60 && score <=69) {
                System.out.println("Passed"); // false : <60
            }else {
                System.out.println("Failed");
                            }


        } else { // if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------------");

        String result = "99";

        if (score >= 0 && score <= 100) {

            //5 possibilities : A, B, C, D, E,F
           if (score >=90 && score <=100) {
                result="Excellent"; // false : <90
            } else if (score >=80 && score <=89) {
                result= "Great"; // false : <80
            }else if (score >=70 && score <=79) {
                result= "Good"; // false : <70
            } else if (score >=60 && score <=69) {
                result= "Passed"; // false : <60
            }else {
                result= "Failed";
            }


        } else { // if the score is not valid
            result= "Invalid Score";
        }
        System.out.println("result = " + result);
    }
}
