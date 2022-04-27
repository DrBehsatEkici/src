package day32_Constructors;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3,5, 8, true);
        Carpet carpet2 = new Carpet(10,20, 10, false);

        System.out.println(carpet1);
        System.out.println(carpet2);

       // in order to create objects you have to use new, then use the constructor that exist in that class
       // here there is one constructor but 4 parameters
    }
}
