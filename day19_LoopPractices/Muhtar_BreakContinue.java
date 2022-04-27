package day19_LoopPractices;

public class Muhtar_BreakContinue {
    public static void main(String[] args) {

        //break statement:

        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(i);

            if (i == 'C') {
                break;
            }
        }
        System.out.println("-----------------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                break;

            }

        }

        System.out.println("-----------------------------------");
        // continue statement; skips the iteration

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);

        }

    }
}


