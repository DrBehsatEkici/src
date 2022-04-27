package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "firefox";

        String result = " ";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";

        if (validBrowser) {
            //5 Options

            if (browserName == "chrome") {
                result = "Chrome Browser is Selected";

            } else if (browserName == "firefox") {
                result = "Firefox Browser is Selected";
            } else if (browserName == "firefox") {
                result = "Firefox Browser is Selected";
            } else if (browserName == "firefox") {
                result = "Firefox Browser is Selected";
            } else {
                result = "Edge Browser is Selected";
            }

        } else {
            result = "invalid browser";
        }

        System.out.println(result);


        /*

        Create a class called Browser. Write a program that can display the name of the selected browser
        1 declare a string variable and browser name
        assume that the valid browsers are chrome, firefox, opera, safari, edge,

        MUST use nested if


         */
    }
}



