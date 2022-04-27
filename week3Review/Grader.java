package week3Review;

public class Grader {

    public static void main(String[] args) {

        // for a given grade assign letter grades: 100-90: A- 89-80: B, 79-70: c, 69-60 d, below f.

        int grade =185;

        if (grade >0  && grade <=100) {

            System.out.println("Your Grade is valid");
            if (grade <=100 && grade >= 90) {
                System.out.println("A");
            } else if (grade <90 && grade >= 80) {
                System.out.println("B");
            } else if (grade <80 && grade >= 70) {
                System.out.println("C");
            } else if (grade <70 && grade >= 60) {
                System.out.println("D");
            } else
                System.out.println("F ");

        } else {
            System.out.println("not valid grade");
        }
    }
}
