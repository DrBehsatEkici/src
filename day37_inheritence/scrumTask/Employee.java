package day37_inheritence.scrumTask;

public class Employee extends Person {


    // when we create the constructor it imports the person (parent) class plus it adds the addditional variables.
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work () {

        System.out.println(jobTitle +  " " + name + " is working");
    }

    public String toString() { // you can change the order at toSTring method, you can customize.
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $ " + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
