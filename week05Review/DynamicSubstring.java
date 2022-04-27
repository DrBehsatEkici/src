package week05Review;

public class DynamicSubstring {

    public static void main(String[] args) {

        String searchResult ="result count: 12345";
                          //  0123456789.........
        searchResult =searchResult.substring(13); // takes the beginning index and rest of the string

        System.out.println(searchResult.substring(13,18));

        //System.out.println(searchResult.indexOf(":"));
        //int colonIndex =

        //System.out.println(searchResult.substring(colonIndex+1));

        String searchResultTwo = "username: oscar search result count: 12345 ";
        int firstColan = searchResultTwo.indexOf(":");
        System.out.println("firstColan = " + firstColan);
        int secondColon= searchResultTwo.indexOf(":");

        System.out.println(searchResultTwo.substring(secondColon +1, secondColon+6));

        String today = "I coded a lot of [java] today";
       // String word= today.substring(today.indexOf("[")+1), today.indexOf("]" ));

    }
}
