package day09_ifStatements;

public class MedianNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c= 30;


        /*
        if we have three different numbers; one must be maximum, one must be minimum and one must be a median
        in order for a to be the median number:
        1. if c is the maximum number & be is the minimum number then a is a median number
        2. if b is the maximum number & c is the mininum number, then a is the median number
         */
        boolean aIsMedian = ( a> b && a<c || a > c && a <b);
        boolean bIsMedian = ( b>a && b<c || b<a && b>c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is the median number");
        }

        if (bIsMedian) {
            System.out.println(b+ " is the median number");
        }

        if (cIsMedian) {
            System.out.println(c+ " is the median number");
        }



    }
}
