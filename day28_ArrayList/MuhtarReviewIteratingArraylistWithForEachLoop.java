package day28_ArrayList;

import java.util.ArrayList;

public class MuhtarReviewIteratingArraylistWithForEachLoop {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10); // index 0
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60); // index 5, last index size () -1

        // arraylist is a data structure, so we can apply the for each loop.

        for (int each:numbers) {
            System.out.println(each);
        }

       System.out.println("-----------------------------");

       for (Integer each:numbers) {
           System.out.println(each);
       }

        }

    }

