package day28_ArrayList;

import java.util.ArrayList;

public class MuhtarReviewIteratingArrayListWithForLoop {

    public static void main(String[] args) {

        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(10); // index 0
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60); // index 5, last index size () -1

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
            System.out.println("--------------------------------");

            for (int i = numbers.size()-1; i >=0; i--) { // reversed order
                System.out.println(numbers.get(i));
            }

                System.out.println("-----------------------------");

                for (int i = 0; i < numbers.size() ; i++) {
                    System.out.println(numbers.get(i));

                }

        System.out.println("-----------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));

        }

    }

            }




