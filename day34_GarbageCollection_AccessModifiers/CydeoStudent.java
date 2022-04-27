package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName= "Cydeo"; // you can directly assign the static variable

    public CydeoStudent (String StudentName) {
        this.studentName =
        schoolName= "Cydeo School";
    }
    static {
        schoolName = "Cydeo School";
    }
}

class CydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");

        CydeoStudent student2= new CydeoStudent("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
