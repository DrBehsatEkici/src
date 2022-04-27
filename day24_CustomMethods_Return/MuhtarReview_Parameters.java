package day24_CustomMethods_Return;

public class MuhtarReview_Parameters {

    public static void main(String[] args) {
        displayValue(10);

        System.out.println("-----------------------------------");

        eligibleToVote(23, true); //You need to follow the order of the arguments

        System.out.println("-----------------------------------");

        oddOrEven(200);
    }

    public static void displayValue (int num) { //when you call the argument it is mandatory to provide value
        // value should match with the data type int==>int
        System.out.println("The value is: " + num);
    }


   public static void eligibleToVote (int age, boolean isUsCitizen) {
        if (age >=18 && isUsCitizen){
       System.out.println("Eligible to Vote");
       } else {
            System.out.println("Is not Eligible to Vote");

    }
   }
   public static void oddOrEven (int number) { // we pass parameter to uderstand if it is even or odd
        if (number %2==0) {
            System.out.println( number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }

   }

}
