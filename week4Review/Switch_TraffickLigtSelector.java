package week4Review;

public class Switch_TraffickLigtSelector {
    public static void main(String[] args) {

        char color = 'r';

        switch (color) {
            case 'R' : case 'r': // or logic
                System.out.println("Red Light");
                break;

            case 'O' : case 'o': // or logic
                System.out.println("Red Light");
                break;

            case 'G' : case 'g': // or logic
                System.out.println("Red Light");
                break;

            default:
                System.out.println("Invalid Light");
        }
    }
}
