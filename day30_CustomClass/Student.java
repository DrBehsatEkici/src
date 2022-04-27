package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;



    //local variable and instance variable share the same name, in this siutation we use "this" before the variables.
        // by default intellij IDE calls the local variable.
        // the only way to call the instance variable is putting this in front of the variable.



    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    //to generate set info method right click, generate,  constructor, select all, OK

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';


    }


    public void code () {
        System.out.println(name + "is coding ");
    }

    public void sleep () {
        System.out.println(name + "is sleeping");
    }
}
