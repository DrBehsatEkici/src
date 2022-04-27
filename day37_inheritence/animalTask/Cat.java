package day37_inheritence.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch () {
        System.out.println(name + "is scratching");
    }


    /// if parent class has constructor with argument, child class should set a constructor.
    // only a constructor can call another constructor.
    // ALT + ENTER twice. on public class cat extends Animal.
}
