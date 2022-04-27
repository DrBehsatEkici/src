package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(); //array list does not support primitive data. you cannot use int
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) { //i: index numbers of list
            list.set(i, list.get(i)*2);

        }

        System.out.println(list);

    }
}

/*

{1,2,3,4,5,6}
task: multiply every element by 2
 {2,4,6,8,10,12}
 */