package day18_NestedLoops;

public class Exam {

    public static void main(String[] args) {

        byte b= 104;
        boolean check = b<100;

        if (check) {
            b-=100;
        }else {
            b= 50;
        }
        System.out.println("b = " + b);
    }
}
