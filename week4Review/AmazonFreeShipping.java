package week4Review;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        double totalPrice = 55.50;

        if (totalPrice >=25) {
            System.out.println("FREE Shipping eligible.Your order total : $ " + totalPrice);
        } else {
            System.out.println ("NOT Eligible for free shipping : $ "+ totalPrice);
        }

        System.out.println("Thanks for shopping with us !");


        //if the total price is more than or equal to 25 print FREE SHIPPING ELIGIBLE
        // else NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. Less than minimum of $25


    }

}
