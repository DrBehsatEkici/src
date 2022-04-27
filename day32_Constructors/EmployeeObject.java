package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1=new Employee("Aaron");

        Employee employee2 = new Employee("Yuliya", 'F');

        Employee employee3= new Employee("Olga", 'F', "SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        // if we get the hashtag it means we did not create the toString method
        // we can give many constructors as long as the parameters are different

        // YOU ARE NOT DONE WITH THIS DAY, GO BACK
    }
}
