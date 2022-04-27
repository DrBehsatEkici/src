package week6_review;

public class InfiniteLoop {
    public static void main(String[] args) {

        int z=0;

        for (int i = 0; i <100 ; z++) { // condition is not related to iteration INFINITE LOOP
            System.out.println("Z = " + z); // INFINITE LOOP, condition and iteration has to be correlated
        }
    }
}
