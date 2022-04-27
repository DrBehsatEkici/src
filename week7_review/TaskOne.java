package week7_review;

public class TaskOne {
    public static void main(String[] args) {


    /*
    print below pattern using loop
    rows: 5
    columns: 5

    1
    2 6                 : row -1
    3 7 10              : row -1,  row -2
    4 8 11  13          : row -1,  row -2, row -3
    5 9 12  14 15       : row -1,  row -2, row -3, row -4
  // +4 +3 +2 +1

     */

    int rowCount= 5;
        for (int row = 1; row <=rowCount ; row++) {

            int value = row;
            for (int col = 1; col <=row ; col++) {
                System.out.print(value+ " ");
                value += rowCount-col; // adding 4 for col=1, adding 3 for col=2

            }

            System.out.println();

        }


    }


}
