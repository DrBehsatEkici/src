package week4Review;

public class Switch_AdaireApartments {

    public static void main(String[] args) {

        System.out.println("#### WELCOME TO ADAIRE APARTMENTS####");
        int numberOfBedrooms =10;
        double startingPrice= 0; 
        
        switch (numberOfBedrooms) {
            case 0:
                System.out.println("You have selected a studio apartment");
                startingPrice =1545.0; 
                break;
            case 1: // here you dont use semicolons, instead colons (:)
                System.out.println("You have selected one bedroom apartment");
                startingPrice =1725.0;
                break;
            case 2: 
                System.out.println("You have selected two bedroom apartment");
                startingPrice =2899.0;
                break;  
            default:
                System.out.println(numberOfBedrooms + " bedroom apartment not available");

        }

        System.out.println("startingPrice = " + startingPrice);
    }
}
