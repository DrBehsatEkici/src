package day11_Switch_Scanner;

public class DaysInWeek_cookies {

    public static void main(String[] args) {

        int cookies =10;
        String day = "tuesday";
        

        switch (day ) { // 1,2,3,4,5,6,7. ==
            
            case "Sunday":
                cookies ++;

            case "monday":
                cookies +=5;
                break;

            case "tuesday":

            case "Wednesday":
                cookies +=10;
                break; // exists the switch after executing the case block

            case "thursday":
                cookies +=5;
                break; // exists the switch after executing the case block

            case "Friday":

                break; // exists the switch after executing the case block
            case "Saturday":
                cookies --;
                break; // exists the switch after executing the case block
            default:
               cookies =0;
                // we don't use break here as there is a curly brace underneath.
        }
        System.out.println("cookies = " + cookies);
    }
}

// you cannot use float, long, double, boolean for the switch statements.
// you can use byte, int, short, char