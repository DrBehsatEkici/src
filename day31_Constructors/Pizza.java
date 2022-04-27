package day31_Constructors;

public class Pizza {

    public char size;

    public int numberOfCheeseTopping, numberofPepperoniTopping;

    public Pizza (char size, int numberOfCheeseTopping, int numberofPepperoniTopping) {

        this.size= size;
        this.numberOfCheeseTopping= numberOfCheeseTopping;
    }

    public double calcCost () {
        double startingPrice = (size == 'S') ? 10: (size =='M') ? 12: 14;
        double totalPrice= startingPrice+ (numberOfCheeseTopping+numberofPepperoniTopping) *2;
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +  //to string method with right click
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberofPepperoniTopping=" + numberofPepperoniTopping +
                ", total price = $" + calcCost() + // this line is added to the toString method
                '}';
    }
}

