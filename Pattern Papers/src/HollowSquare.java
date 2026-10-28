public class HollowSquare {


    public static void main(String[] args) {

        // for print the row
        for (int i = 1; i <= 5; i++) {

            //for print the column
            for (int j = 1; j <= 5; j++) {

                //i == 1: Print stars in the first row.
                // i == n: Print stars in the last row.
                // j == 1: Print a star in the first column.
                //j == n: Print a star in the last column.
                if (i == 1 || i == 5 || j == 1 || j == 5)

                    System.out.print("* ");

                else {
                    System.out.print("  ");
                }
            }

            System.out.println();


        }
    }
}
