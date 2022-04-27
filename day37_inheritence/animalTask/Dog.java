package day37_inheritence.animalTask;

public class Dog extends Animal {



    public Dog (String name, String breed, char gender, int age, String size, String color ) {
        super (name, breed, gender, age, size, color);


    }
    public void bark () {
        System.out.println(name + " is barking");

    }

    // if you dont create a constructor, compiler creaates a constructor for you. It is a default constructor.
    // child constructor must call the parent classes constructor. it is MANDATORY
}
