package day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() { //created to string method by rightclicking, to be able to print each object
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $ " + salary + // added $ to the original to string method.
                '}';
    }

    public void smokeTesting () {
        System.out.println(name+ "is smoke testing");

    }

    public void creatingTicket () {
        System.out.println(name+ "is creating the ticket");
    }
}


/*
create a class called tester

attributes:
name, employeeID, jobTitle, Salary

Add a Constructor that can set all the fields

Actions:

smokeTestking() creatingTicket (), dailyStandup(), toString ()
 */