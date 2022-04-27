package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {
        String [] names = {"Alminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begencjov",
                "Ruveyda Keles", "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) { // each:lminur Ablimit", "Ali Kilic", "Hulya Keles",

            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed +=each.charAt(i);

            }
            System.out.println(reversed);

        }


    }
}
