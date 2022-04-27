package day28_ArrayList;

import java.util.ArrayList;

public class MuhtarReviewArraylistMethodsPart1 {

    public static void main(String[] args) {

        ArrayList <String> groceryList = new ArrayList<>();

        // add (element): add the elemet into arraylist, size will be increased by 1

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        System.out.println(groceryList);

        System.out.println("-----------------------------------------");

        // size () returns the total number of elements of the Arraylist, return type is int

        int a = groceryList.size();
        System.out.println(a);

        // get (index) returns the element at the given index from the arraylist
        System.out.println(groceryList.get(1));

        // set (index, newElement): replaces the element of the arrayList at given index to the new element.
        groceryList.set(2, "Eggs");
        System.out.println(groceryList);

        //remove (int index) removes the given object from the Arraylist (first matching) and returns boolean
        groceryList.remove(3); //removes the index 3
        System.out.println(groceryList);

        System.out.println("--------------------------------");

        // remove (object): removes all the objects from the Arraylist, size will be set to zero

        boolean r1=groceryList.remove("java"); //false because there is no java in the grocery list.
        System.out.println(groceryList);
        System.out.println(r1);

        // clear (); removes all the objects from the Arraylist, size will be set to zero. ,

        groceryList.clear();
        System.out.println(groceryList);

        System.out.println("--------------------------------");

        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        //indexOf(element): returns the index number of the first mathing element from the ArrayList, return type int.

        int b= numbers.indexOf(20);
        System.out.println(b);

        int c= numbers.lastIndexOf(20);
        System.out.println(c);

        int d= numbers.lastIndexOf(10);
        System.out.println(d);


    }
}
