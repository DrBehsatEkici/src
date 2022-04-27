package day28_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num=1; // index1
        list.remove(num);
        System.out.println(list);
        */

        Integer num = 200;
        //list.remove(num); //removes by element. It only removes one of them.
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("-----------------------------------------");

        // clear method removes all the elements in the array list

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("-----------------------------------------");

        // indexOf brings the first matching character
        // lastIndexOf brings the last matching character

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');


        int a = characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------------------------------");

        //contains method

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------");

        //equals () method for non-primitive data

        ArrayList <Integer> list1= new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);

        ArrayList <Integer> list2= new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);

        System.out.println(list1==list2); //false, because we used "new" array list.
        System.out.println(list1.equals(list2));

        System.out.println("-----------------------------------------");

        //is empty method
        boolean r4= list1.isEmpty(); //false
        list1.clear();
        System.out.println("r4 = " + r4);

        System.out.println("-----------------------------------------");

        //bulk operators, you have to pass a COLLECTION type data. addAll,

        ArrayList <Integer> numbers= new ArrayList<>();

        //BULK operation: you must have a COLLECTION type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);

    }

}

