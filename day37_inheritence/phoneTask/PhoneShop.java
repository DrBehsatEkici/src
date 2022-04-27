package day37_inheritence.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung ("Samsung", "Galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia ("Nokia", "Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.facetime(7895623);
        iphone.facetime("yahoo.gmail.com");


        System.out.println("---------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("------------------------------");

        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefense();

        System.out.println("------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

    }

    //3:03
}
