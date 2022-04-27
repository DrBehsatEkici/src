package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public GarbageCollection() {
    }

    public static void main(String[] args) {

       /*
        String str = null;
        */

        String str= "Wooden Spoon";

        //str=null;

        System.out.println(str);


        System.out.println("-----------------------------");



       Car car1= new Car("Toyota");

       car1=null; //after this line toyota is eligible for garbage collection.

        System.out.println(car1);

        System.out.println("---------------------------");

        Dog dog1 = new Dog();
        dog1.name= "Lucy";

        dog1= new Dog ();
        dog1.name= "Max";

        System.out.println(dog1);

        String language = "Python";
        language=         "Java";

        System.out.println(language);

        System.out.println( "------------------------");

        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(100);

        ArrayList <Integer> list2= list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1); //list1 and list2 are the same objects.
        System.out.println(list2); // objects are shared by two list, they are referenced by two lists.

        System.out.println("------------------------------------");

        Student student1= new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade= 'A';

        Student student2= student1; // two doors of the same room.
        student2.name= "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------");

        ArrayList <String> l1= new ArrayList<>();
        l1.add("Java");

        ArrayList <String> l2= new ArrayList<>();
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);




        // null means nothing has ever created. There is no object.
        // After line 13 "wooden spoon" will be eligible for garbage collection.


        // all the objects that does not have any reference name will be collected by the garbage collector.
        // garbage collector destroys the unrefrences objects, which are eligible for garbage collection.
        // to create more space and enhance performance.
    }
}


// 3.20