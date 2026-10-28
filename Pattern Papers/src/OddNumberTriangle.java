public class OddNumberTriangle {


    public static void main(String[] args) {

    int number =1;

    for (int i=1 ; i<=5; i++){

        for ( int j=1; j<=i; j++){

            System.out.print(number + " ");

            // to increase the num 2 >> 1+2= 3, 3+2= 5>> like that
            number = number +2;
        }
        System.out.println();
    }

    }



}
