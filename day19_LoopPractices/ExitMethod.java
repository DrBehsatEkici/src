package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {

            if (i==3){
                //break; // terminates the loop
                //continue; /// it does not iterate 3, but the rest of the characters are printed
                System.exit(0); // it terminates the entire program if the condition is true
            }

            System.out.println("i = " + i);

        }

        System.out.println("wooden spoon");
    }


}
