package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        ArrayList<String> unique =new ArrayList<>();

        for(String each: list) { // to use "for each loop" you need to have a data strcuture
            if (list.indexOf(each) == list.lastIndexOf(each)) { //compare the first and last index numbers. if they are equal it means unique.
                unique.add(each);

            }

        }
        System.out.println(unique);


    }

}
