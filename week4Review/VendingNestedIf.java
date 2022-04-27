package week4Review;

public class VendingNestedIf {

    public static void main(String[] args) {
        
  
    String selection = "drink";
    String drinkItem = "Coffee";
    String snackItem= "Chips";

    if (selection == "drink") {
        System.out.println("drink option is selected");
        if (drinkItem == "tea") {
            System.out.println("tea item selected");

        } else if (drinkItem== "coffee") {
            System.out.println("Coffee item selected");
        }

    } else if(selection== "snack") {
        System.out.println("Snack option is selected");
        if(snackItem== "chips") {
            System.out.println("Chips is selected");
        } else if (snackItem== "candy") {
            System.out.println("Candy is selected");
        }
        
    } else {

        System.err.println("INVALID ENTRY");
    }

}

}
