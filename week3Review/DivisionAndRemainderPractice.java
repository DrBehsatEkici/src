package week3Review;

public class DivisionAndRemainderPractice {

    public static void main(String[] args) {

        //input is some amount of seconds (45000)
        // hours: minutes: seconds

        int inputSeconds = 45000;
        int hours, minutes, seconds; // declared

        /*
        Algorithm:
        1. 1 minute is 60 seconds, 1 hours 3600 seconds
        2. remainder operator to turn input seconds to find seconds
         */
        seconds =inputSeconds %60;
        minutes =(inputSeconds/60) % 60; //calculate remaining seconds
        hours =inputSeconds % 3600; //

        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);

        String clock = "Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds;

        System.out.println("clock = " + clock);

    }
}
