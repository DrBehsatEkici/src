package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j); //for each character from the string
            int count =0;

            for (int i = 0; i <str.length() ; i++) { // to find the frequency of character
                char each = str.charAt(i);
                if (ch == each ) {
                    count ++;
                }


            }

            if (result.contains ("" +ch)) { // concate it to a string . contains can be used only within string.

            }
           result +=ch;
           result +=count;

            System.out.println("result = " + result);


        }





        }
    }



