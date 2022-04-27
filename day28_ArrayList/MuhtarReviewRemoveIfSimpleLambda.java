package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MuhtarReviewRemoveIfSimpleLambda {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,4,5,5,6,6,7,7,8,8));

        //reoveIf(Predicate): removes all the elements from the ArrayList that are matching the given predicate condition
        // predicate anticipates you give a boolean expression

        list.removeIf(each->each <5);
        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList <String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Python","C#","JavaScript","Junit","Jquery","C++","Ruby"));

        names.removeIf(p->p.startsWith("J"));
        System.out.println(names);

        /* for (int i = 0; i < list.size() ; i++) {

            if (list.get(i) <5) {
                list.remove(i);
            }
            System.out.println(list);

         */
        }
    }

