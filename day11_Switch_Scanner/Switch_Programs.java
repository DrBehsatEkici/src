package day11_Switch_Scanner;

public class Switch_Programs {

    public static void main(String[] args) {

       String str = "";
       int num  = 20;
        

        switch (num ) {

            case 0:
                str = "C# ";
                break;
            case 10:
                str += "is ";

            case 15:
                str = "fun ";

            case 20:
                str += "Java ";

            case 25:
                str += "is ";
                break;
            case 30:
                str += "fun";
                break;
            case 35:
                str = "python";

            case 40:
                str += "90";

        }
        System.out.println(str);
    }
}

// you cannot use float, long, double, boolean for the switch statements.
// you can use byte, int, short, char