package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo", "school");

        System.out.println("---------------");

        domain("cydeo.school@gmail.com");

        System.out.println("---------------");

        String [] emails= {"josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com", "gulsen@gmail.com"};
        for (String email: emails) {
            domain(email);

        System.out.println("---------------");

        nameOfMonth(12);
        }


    }


        // Create a method that can display the initials of the person. initials (string firstName, string lastname)

        public static void initials(String firstName, String lastName) {
            String initials = firstName.charAt(0) + "." +lastName.charAt (0);
            initials= initials.toUpperCase();
            System.out.println("initials = " + initials + ".");
        }

        // create a method that can display the domain of the email.
    // You should always analyze the function and requirement

       public static void domain (String email) { //cydeo@gmail.com

           // void method just executes the function it does not return any value.
           // if you want to make a specific data then we use return method

           String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
           System.out.println("domain = " + domain);

           // create a method that can display the name of the month based on the given number to the method

       }
        public static void nameOfMonth(int number ) {

            String name = "";


            if (number >= 1 && number <= 12) {
                name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" :
                        (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" :
                                (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
            } else {
                name = "invalid";
            }

            System.out.println(" Mont name = " + name);
        }

        // 4. create a method that can print the name of the day on the given number to the method.
        public static void nameOfDay (int number) {

        //1.58

        }



           }










/*
        warmup tasks:
        1. Create a method that can display the initials of the person
        2. create a method that can display the domainof the email.

        3.
         */