package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee (String name) { this.name=name; }


    public Employee(String name, char gender) {

        this (name); // constructor within a constructor
        this.gender=gender;
    }

    public Employee (String name, char gender, String jobTitle) {
        this(name, gender); // this.name=name;
        this.gender =gender;
        this.jobTitle=jobTitle;
    }
    public Employee (String name, char gender, String jobTitle, double salary) {
        this (name, gender, jobTitle);
        this.salary=salary;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void method () {
        System.out.println("Method1");
    }

    public void method2 () {
        System.out.println("Method2");
    }
}
// CONSTRUCTOR RULES
// 1.construtor cannot be called by its name
// 2. only a constructor can call another constructor
//3. constructor call must be at the first step
//4. one constructor cannot call more than one constructor
//5. constructor cannot call or contain itself.

// IF YOU BREAK THESE RULES COMPILER WILL GIVE ERROR

//When you call a constructor within another constructor we use this ()