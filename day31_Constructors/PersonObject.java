package day31_Constructors;

public class PersonObject {

    public static void main(String[] args) {



        Person person1= new Person("Daniel", 'M', 32);
        Person person2= new Person("Kseniia", 'F', 28);

        person2.age=30;

        System.out.println(person1);
        System.out.println(person2);



        // for subject intro listen to 1.55 to 2.25
        //short videos

        //when you dont give a cosntructor, compiler creates a default constructor.
    }
}
