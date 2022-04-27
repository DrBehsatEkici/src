package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo (String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor) {
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender= dogGender;
        size=dogSize;
        color=dogColor;

    }

    public void eat () {
        System.out.println(name + "is eating");
    }

    public void bark () {
        System.out.println(name +  " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';

    }
}

// to create to sting method
// right click --> generate-->toString --> select all BUT unslect insert Override -->click OK.
// you are not going to get the hashcode after this right click toString method.
//CUSTOM CLASS: we dont need the main method in custom class
// we dont use them for running
// we just create objects.

/*

Attributes:
name, age, gender, breed, size, color



Actions:
eat, play, bark................

 */