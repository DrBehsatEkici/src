package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MuhtarReviewArrayListMethodPart2 {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        // add (element): add the element into arraylist, size will be increased by 1

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        // contains (element): checks if the ArrayList contains the given element, return type is boolean

        boolean r1= groceryList.contains("Apple");
        System.out.println(r1);

        //equals (list): checks if the Arraylist is equal to the given list, return type is boolean.

        ArrayList <String> list1= new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        boolean r2= list1.equals(groceryList);
        System.out.println(r2);

        //is Empty(): checks if the Arraylist is empty (size is zero), return type is boolean.
        boolean r3= groceryList.isEmpty();

        System.out.println(r3);

        System.out.println("------------------------------------------");
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // containsAll (CollectionType): checks if the Arraylist contains all the given collection of values, return type is boolean
        boolean r4= numbers.containsAll(Arrays.asList(10,20,30,40));
        System.out.println(r4);

        //addAll(collectionType) adds all the given collection of values to the arrayList

        System.out.println(numbers);

        numbers.addAll(Arrays.asList(70,80,90,95,100));

        System.out.println(numbers);

        System.out.println("------------------------------");

        //removeAll(collectionType) removes all the matching values from thee Arraylist
        numbers.removeAll(Arrays.asList(10,50,80));
        System.out.println(numbers);

        System.out.println("------------------------------");
        //retainAll(CollectionType): removes all the un-matching values from the ArrayList. (keeps the matching values only)
        numbers.retainAll(Arrays.asList(20,40,70));
        System.out.println(numbers);


    }
}
