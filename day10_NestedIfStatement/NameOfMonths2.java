package day10_NestedIfStatement;

public class NameOfMonths2 {

    public static void main(String[] args) {
        int n = 5;

       String name = (n==1) ? "Jan" : (n==2) ? "Feb" : (n==3) ? "Mar" : (n==4) ? "April" : (n==5) ? "May" :
                (n==6) ? "June" : (n==7) ? "July" : (n==8) ? "Aug" : (n==9) ? "Sep" :
                        (n==10) ? "Oct" : (n==11) ? "Nov" : "Dec";

        System.out.println(name);

        //Paranthesis are optional but strongly recommended.
    }
}
