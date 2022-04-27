package day09_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n1= 100;

        System.out.println("Positive");
        System.out.println("Negative");
        System.out.println("Zero");

        System.out.println("--------------------------------------");

        int n= -100;
        boolean positive = n>0;
        boolean negative = n<0;

        if (positive) {
            System.out.println("positive");
        } else if (negative) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

}
