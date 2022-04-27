package day19_LoopPractices;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; // bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }

            if (count== 1) { // if the frequency of the chracter is 1, then the character is unique.
                result += ch;

            }

            System.out.print(count);

          /*  if (count !=1) {
                continue;
                this is another way to find unique
           */
            }



        }
    }

