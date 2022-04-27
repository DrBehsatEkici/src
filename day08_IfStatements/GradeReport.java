package day08_IfStatements;

public class GradeReport {

    public static void main (String[] args)  {

        int score = 95;

        boolean a= score >= 90 && score <= 100;
        boolean b= score >= 80 && score <= 89;
        boolean c= score >= 70 && score <= 79;
        boolean d= score >= 60 && score <= 69;
        boolean f= score >= 0 && score <= 59;

        if (a) {

            System.out.println("Excellent ");

        }

        if (b) {
           System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }
        if (f) {
            System.out.println("Failed");
        }
        /*

        score:
        90-100 ==> excellent
        80-89 ==> great
        70-79 ==> good
        60-69 ==> passed
        0-59 ==> failed

         */
    }
}
