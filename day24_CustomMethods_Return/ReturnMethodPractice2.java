package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        // create a function that can calculate the grade.
        // you cannot reuse any data from the void method.

        String str1 = grade(95);

     /*
    check the grade:
    'A' ====> Excellent
    'B' ====> Great

     */
        if (str1.equals("A")) {
            System.out.println("Excellent");
        } else if (str1.equals("B")) {
            System.out.println("Great");
        } else if (str1.equals("C")) {
            System.out.println("Good");
        } else if (str1.equals("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Try Again");

        }

    }


        public static String grade(int score){
            { // if there is a value that you want to use outside you should use return method
                String result = "";

                if (score < 0 || score > 100) {
                    result = "Invalid";
                } else {

                    result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
                }

            return result;

            }


        }
    }

