public class DescendingAlphabetTriangle {


    public static void main(String[] args) {

        for( int i=1; i<=5 ; i++){

            for( int j=0 ; j< i; j++){

                System.out.print((char)('A' + 5 - 1 - j));
            }
            System.out.println();
        }

    }
}
