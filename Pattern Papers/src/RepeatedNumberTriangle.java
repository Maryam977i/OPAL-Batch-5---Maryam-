public class RepeatedNumberTriangle {



    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // repeats everytime by one i=5 , and when i= 5 the j repeats 6( from 0 to 5)
            for (int j = 1; j <= i; j++) {


                //i is the current row number.
                // " " adds a space between the numbers so they do not stick together.
                //+ joins the number with the space.
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    }


