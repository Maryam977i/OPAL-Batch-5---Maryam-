public class PlusSign {


    public static void main(String[] args) {

        for( int i=1; i<=5; i++){
            for (int j=1; j<=5; j++ ){


                //i== (5+1)/2  row prints stars horizontally
                // j==(5+1)/2)  column prints stars vertically
                if (i== (5+1)/2 || j==(5+1)/2){


                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }}

