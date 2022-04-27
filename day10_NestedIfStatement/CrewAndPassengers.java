package day10_NestedIfStatement;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number =75;
        String result = "";

        boolean validNumber = number ==50 || number ==75 || number ==100;

        if (validNumber) {

            if (number ==50) {
                result = "20 crew, 30 passengers";
            } else if (number ==75) {
                result = "25 crew, 50 passengers";
            } else
                result = "30 crew, 70 passengers";

       } else {
        result= "invalid number";
        }

        System.out.println("result = " + result);
    }

}

/*

Create a class called CrewAndPassangers

total: 50 ====> 20 crew, 30 passengers
total: 75 ====> 25 crew, 50 passengers
total: 100 ====> 30 crew, 70 passengers

Any other number of the people on the ship is not valid

NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT.

 */
