package day07_Operators;

public class RelationalOperators {

    public static void main (String[] args)  {
        
        // >, >=,  <, <=
        
        boolean result1 = 20> 40; //false
        System.out.println("result1 = " + result1);
        
        boolean result2= 300>= 150; // true

        System.out.println("result2 = " + result2);
        
        boolean result3= 100 >= 100; // true

        System.out.println("result3 = " + result3);
        
        boolean result4= 300 >= 500; // false

        System.out.println("result4 = " + result4);
        
        // credit score of 720 is required
        
        int creditScore = 745; 
        
        boolean isEligibleForLoan= creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        
        boolean result5 = 100 < 120; // true

        System.out.println("result5 = " + result5);
        boolean result6 = 300<= 150;

        System.out.println("result6 = " + result6);

        int score = 58;
        boolean hasFailed = score <= 59;

        System.out.println("hasFailed = " + hasFailed);

        System.out.println("--------------------------------------");


       // int k; 100;
      //  int m; 200;
        //boolean result8= k==m; // false

        boolean result9 = 'A' == 'a';

        System.out.println("result9 = " + result9);

        boolean result11= 100 !=200.5; // true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true

        boolean result13 = 300 !=300;

        
        
        
    }
}
