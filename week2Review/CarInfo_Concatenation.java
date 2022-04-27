package week2Review;

public class CarInfo_Concatenation {

    public static void main (String[] args) {

        int year = 2022;
        String make= "Audi";
        String model= "A6";
        //automatic =true; manual =false;
        boolean transmission =true;
        String Color= "black";
        int mileage = 0;
        int price = 100_000;

        System.out.println ( year + "|" + model + "\n Automatic Transmission " + transmission);
        System.out.println ( Color + " | " + mileage + " kilometers |" + price+ " Euros");

        // lets turn this value into Turkish liras.

        double priceInTL = price * 15.5;
        double taxRate =1.80; // for this kind of car
        double priceAfterTaxInTL = priceInTL + (priceInTL*taxRate);


        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

// variables are used because it makes our data reusable and maintainable


    }

}
