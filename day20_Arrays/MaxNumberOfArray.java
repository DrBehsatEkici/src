package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {
        
        int [] numbers = {10, 5, 4, 20,1, 0}; 
        int max= numbers [0]; //0

        for (int i = 0; i < numbers.length; i++) {

            if (numbers [i]>max) { // if there is element in the array that is greater than the current max num
                max = numbers [i]; // assigning greater number to variable max

            }

            System.out.println(max);
            
        }
        
        
       // for (int i = 0; i < numbers.length; i++) { //SHORTCUT numbers.fori
        //for (int i1 = numbers.length - 1; i1 >= 0; i1--) { //SHORTCUT numbers.forr reverse
                
            }    
            
        }
        


