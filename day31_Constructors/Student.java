package day31_Constructors;

public class Student {

    public String name;
    public int age;
    public char gender;
    public char grade;
    public int id;

   //we call the constructor, generate->constructor

    public Student(String name, int age, char gender, char grade, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;

        //we better call to string method to be able to print the objects.
    }


}
