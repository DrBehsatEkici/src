package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number =2;
        
        /*
        if (number == 1) { 
         */  
        
        switch (number ) { // 1,2,3,4,5,6,7. ==
            
            case 1:
                System.out.println("Monday");
                break; // exists the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break; // exists the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break; // exists the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break; // exists the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break; // exists the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break; // exists the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break; // exists the switch after executing the case block
            default:
                System.out.println("Invalid");
                // we don't use break here as there is a curly brace underneath.
        }

    }
}

// you cannot use float, long, double, boolean for the switch statements.
// you can use byte, int, short, char