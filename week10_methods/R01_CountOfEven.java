package week10_methods;

public class R01_CountOfEven {

    public static void main(String[] args) {

        int [] arr= {2,5,6,9,10,20,7,19};
        System.out.println(counter(arr));
    }

    // will take parameter, int [] iarr
    // will return a number

    public static int counter (int []arr) {
        int count=0;
        for(int eachNumber: arr) {
            if(eachNumber%2==0) {
                count ++;
            }
        }

        return count;
    }
}
