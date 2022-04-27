package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        //Add method adds the data after the last index of the ArrayList
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10); //index 0
        numbers.add(20); //index 1
        numbers.add(30); //index 2, after the addition it will be index 3
        numbers.add(40); //index 3
        numbers.add(50); //index 4
        numbers.add(60); //index 5

        numbers.add(2,25); //inserts 25 to index 2
        numbers.add(5,45); // inserts 45 to index 5

        System.out.println("-------------------------------------------");

        // size method gives the total number of elements in the arraylist
        System.out.println(numbers.size());
        
        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-------------------------------------------");

        // get method is going to return the specific  index
        int num= numbers.get(3); // it is going to get the 4th element

        System.out.println("num = " + num);

        System.out.println("-------------------------------------------");

        for (int i = 0; i <numbers.size() ; i++) { // gets all the elements in the array list.
            System.out.println(numbers.get(i));

       System.out.println("-------------------------------------------");
       // set method will replace the old element in the index with the new element.

        ArrayList <String> list =new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add ("Ruby");

        list.set(2,"JavaScript"); // replaces the old element at index to with a new one. size is not effected.
        list.set(3, "C++");

        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        employees.remove(0); //removes the index number
            System.out.println(employees);

        employees.remove(0); //removes the index number
            System.out.println(employees);

        employees.remove(0); //removes the index number
            System.out.println(employees);

        employees.remove(1); //removes the index number
            System.out.println(employees);

        employees.remove(employees.size()-1); //removes the last index number
            System.out.println(employees);

       boolean r1= employees.remove("Hulya"); //removes the object, it is String non-primitive
            System.out.println(employees);

       boolean r2= employees.remove("Neira"); //removes the object, it is String non-primitive
            System.out.println(employees);

       System.out.println("r1 = " + r1);
       System.out.println("r2 = " + r2);
        }

        
    }
}

//2.31