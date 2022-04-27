package day05_Concatenation2;

public class FullName {

    public static void main (String[] args)  {
        String first_name = "Behsat";
        String last_name = "Ekici";
        int age = 44;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc.";
        String salary = "$100000.58";
        String fullname =first_name + " " + last_name;

        System.out.println(first_name + " " + last_name);
        System.out.println("Full name of the person is " + fullname + ". " + fullname +" is " + age + " years old.");
        System.out.println(fullname + " is " + age + " years old.");

        System.out.println (fullname + " is a " + jobTitle + ". " + fullname + " works at " + companyName + " and " + fullname + "'s salary is " + salary+ ".");


}
}
