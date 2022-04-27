package week7_review;

import java.util.Scanner;

public class ShoppingListReplit {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String shoppinglistReport = " ";
        String item = " ";
        String countinue= " ";
        double price= 0;
        int count =1;
        double totalPrice = 0;

        do {
            System.out.println( "Enter item" + count + "and its price: " );
            item= scan.nextLine();
            price=scan.nextDouble();
            //item1: tomatoes price: 5.5,
            shoppinglistReport += "item" + count + " : " + item+ " Price: " + price + ", ";
            count ++;
            totalPrice +=price;
            System.out.println( "Add one or more item?");
            scan.nextLine(); //takes the enter from previous double method
            countinue= scan.nextLine();
        }

        while (countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppinglistReport.substring(0, shoppinglistReport.length()-1));
        System.out.println("totalPrice = " + totalPrice);



    }
}
