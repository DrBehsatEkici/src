package day31_Constructors;

public class Rectangle {

    public double length, width;

    public Rectangle (double length, double width) { // this constructor is for setting the lenght and width
        this.length = length;
        this.width = width;
    }
        public double calcArea() { //area of the rectangle
            return length * width;
        }
        public double calcPerimeter () {
        return 2 * (length+width);
        }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() + //added to the original toString method
                ", perimeter=" + calcPerimeter() + //added to the original toString method
                '}';
    }
}

