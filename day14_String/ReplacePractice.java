package day14_String;

public class ReplacePractice {

    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.replace("hub", "lab"));

        System.out.println("word = " + word);

        System.out.println(word.replace("i", "o"));

        String searchResult = "1-48 of over 7,000 results for java";
        String actualResult= searchResult.replace("1-48 of over ", " ")
                .replace("results for java", "");

        System.out.println(actualResult);

        String expectedResult = "7000";

        if (expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        }

    }



