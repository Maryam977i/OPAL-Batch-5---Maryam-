public class FullDiamond {


        public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int p = 1; p <= (2 * i - 1); p++) {
                    System.out.print("*");
                }


                System.out.println();
            }

            for (int i = 4; i >= 1; i--) {

                for  (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int p = 1; p <= (2 * i - 1); p++) {
                    System.out.print("*");



                }
                System.out.println();



            }}}





