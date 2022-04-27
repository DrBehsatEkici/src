package day10_NestedIfStatement;

public class GradeReport2 {

    public static void main(String[] args) {

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
        System.out.println("-----------------------------------");

        int s= 190;
        String result= (s>=0 && s <=100)? (s>=90) ? "Excellent" : (s>=80) ? "Great" : (s>=70) ? "Good" :
                (s>=60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);
    }
}
