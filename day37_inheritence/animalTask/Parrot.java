package day37_inheritence.animalTask;

public class Parrot extends Animal {

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

        // right click, generate constructor
    }
    public void sing () {
        System.out.println(name + " is singing");

        //1.04
    }
}
