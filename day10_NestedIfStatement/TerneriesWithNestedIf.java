package day10_NestedIfStatement;

public class TerneriesWithNestedIf {

    public static void main(String[] args) {

        int s =850;

        /*
        if (s>= 0 && s <=100) {

            if (s>=60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else {
                System.out.println("Invalid Score");
            }

        */
        String result = (s >=0 && s <=100) ? (s >=60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);
    }
}
