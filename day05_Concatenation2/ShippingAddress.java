package day05_Concatenation2;

public class ShippingAddress {

    public static void main(String[] args) {
        /*
        String name = "Behsat Ekici";
        String buildingNumber = "227";
        String streetName = "Jefferson Rd.";
        String city = "Penn Hills";
        String state = "PA";
        String zipCode = "15235";
        */


        String name = "Behsat Ekici",
                buildingNumber = "227",
                streetName = "Jefferson Rd.",
                city = "Penn Hills",
                state = "PA",
                zipCode = "15235";


/*
        System.out.println(name + "\n" + buildingNumber + " "+ streetName + "\n" + city+ ", "+ state +" " + zipCode);
*/

        String shippingAddress = name + "\n" + buildingNumber + " "+ streetName + "\n" + city+ ", "+ state +" " + zipCode;

        System.out.println(shippingAddress);

    }

    public static class calculator {

        public static void main (String[] args)  {

            int firstNumber =100;
            int secondNumber =50;
            int addition = firstNumber + secondNumber;
            int subtraction = firstNumber - secondNumber;
            int multiplication = firstNumber * secondNumber;


            // 100+50 = 150

            // 100-50 = 50
            // 100*50= 5000

            System.out.println(firstNumber +  "+" + secondNumber + "=" + addition);
            System.out.println(firstNumber +  "-" + secondNumber + "=" + subtraction);
            System.out.println(firstNumber +  "*" + secondNumber + "=" + multiplication);

        }
    }
}