package day14_String;

public class OscarStringReview_DynamicSubstring {

    public static void main(String[] args) {

        String searchResult = "result count: 12345";
        //                     0123456789.........

        // substring () method takes index location of the char and returns you a new string

        System.out.println (searchResult.substring(13));

        System.out.println (searchResult.substring(13,18));

        System.out.println(searchResult.indexOf(":")); //12
        int colonIndex= searchResult.indexOf(":");

        System.out.println(searchResult.substring(colonIndex+1));
        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));
        String newsearchResult= searchResult.substring(searchResult.indexOf(":"))+1;
        System.out.println("newsearchResult = " + newsearchResult);

        // in indexof ( "" ) if there are more than same character?

        String searchResultTwo= "username: oscar search result count : 12345 more colon: more ";

        int firstColon = searchResultTwo.indexOf(":");
        System.out.println("firstColon = " + firstColon);
        int secondColon = searchResultTwo.indexOf(":", firstColon+1);
        System.out.println("secondColon = " + secondColon);

        System.out.println(searchResultTwo.substring(secondColon+1, secondColon+6));
        // secondColon+1: beginning index
        // secondColon+6: ending index
        
        String today = " I coded a lot of [java ] today"; 
        
        // get me the words inside brackets using index of substring methods. 
        
        String word= today.substring(today.indexOf("[")+1, today.indexOf("]"));
        System.out.println("word = " + word);





    }




}
