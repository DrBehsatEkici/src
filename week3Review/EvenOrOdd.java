package week3Review;

public class EvenOrOdd {

    public static void main(String[] args) {

        // task; find if a given integer is even number or odd number

        int number= 101;


        if (number%2==0) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");

        }

        System.out.println("--------------------------");

        int number2 = 100;

        boolean condition = number2%2==0;

        if (condition) {
            System.out.println("The number2 is EVEN");
        } else {
            System.out.println("The number2 is ODD");

        }



    }
}
