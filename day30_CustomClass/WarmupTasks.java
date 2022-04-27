package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8)); // the argument must be a collection type

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers);


        System.out.println("----------------------------------------");

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        // lets find out how many zeros were in the list.

        System.out.println(list);

        int size= list.size();

        list.removeAll(Arrays.asList(0)); //remove all the zeros from the list

        System.out.println(list);

        int newSize= list.size();

        int totalNumberOfZeros=size-newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i <totalNumberOfZeros ; i++) { //all zeros are added at the end of the list.
            list.add(0);

        }

        System.out.println(list);

        System.out.println("-----------------------------------");

        ArrayList <Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList <Integer> result= new ArrayList<>();

        for (Integer each: list2) {
            if (each!=0) {
                result.add(each);
            }
        }

        for (Integer each: list2) {
            if (each==0) {
                result.add(each);
            }
        }


        System.out.println(result);

        System.out.println("-----------------------------");

        String str= "ABCD123$%&@456EFG"; 
        
        ArrayList <Character> chars =new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add (str.charAt(i));
            
        }

        ArrayList<Character> letters =new ArrayList<>(chars); //add all the characters

        letters.removeIf(p->!Character.isLetter(p)); //lambda, remove the characters that are not letters.

        System.out.println("letters = " + letters);


        ArrayList <Character> digits = new ArrayList<>(chars); //add all the characters

        digits.removeIf(p->!Character.isDigit(p));

        System.out.println(digits);
        
        ArrayList <Character> specialChar =new ArrayList<>(chars); 
        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);

        specialChar.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println("specialChar = " + specialChar);




  //      int [] arr= {1,2,3,4,5,6,7,8};
    //    System.out.println(Arrays.toString(arr));



        //collections do not support primitives
        //ArrayList has more methods and options than the array.


        /*

        1. write a program that can swap the first and last elements of an Arraylist

        2. Write a program that can move all the zeros from the last indexes of Arraylist
         */
    }
}
