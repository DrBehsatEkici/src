package day23_CustomMethods_Void;

public class MuhtarReview {

    public static void main(String[] args) {

        displayMessage(); // we call this message in the main method.
                          // you can group the code fragments and custom method can execute the group.

        System.out.println("Wooden Spoon"); // it will be executed from top to bottom
    }



    //methods should be independent, it cannot be created inside another method.
    public static void displayMessage () {
        System.out.println("Hello World");
        System.out.println("I love java");

   }
}
