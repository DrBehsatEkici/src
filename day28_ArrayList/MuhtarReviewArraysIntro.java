package day28_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MuhtarReviewArraysIntro {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(10); //everytime we use add method, the size of the arraylist grows one.
        list.add(10);
        list.add(10);

        System.out.println(list);
        System.out.println(list.size());


    }
}
