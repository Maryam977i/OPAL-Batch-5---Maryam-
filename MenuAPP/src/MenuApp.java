import java.util.Scanner;

public class MenuApp {


    static Scanner cakeObject = new Scanner(System.in);
    double Celsius = cakeObject.nextDouble();

    public static void main(String[] args) {

        menu();
        int app;

        do {

            System.out.println("Please enter a number between 0 and 9: ");
            app = cakeObject.nextInt();

            switch (app) {

                case 1:
                    celsiusToFahrenheit();
                    break;

                case 2:
                    evenOrOdd();
                    break;

                case 3:
                    maxOfThree();
                    break;


                case 4:
                    factorial();
                    break;


                case 5:
                    multiplicationTable();
                    break;

                case 6:
                    starTriangle();
                    break;

                case 7:
                    isPrime();
                    break;

                case 8:
                    reverseNumber();
                    break;

                case 9:
                    numberPyramid();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid app. Please try again");

            }

        }
        while (app != 0);


        cakeObject.close();
    }

    public static void menu() {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Even or odd");
        System.out.println("3. Maximum of three numbers");
        System.out.println("4. Factorial");
        System.out.println("5. Multiplication table");
        System.out.println("6. Triangle of stars");
        System.out.println("7. Prime check");
        System.out.println("8. Reverse a number");
        System.out.println("9. Number pyramid");
        System.out.println("0. Exit");

    }

    public static void celsiusToFahrenheit() {

        double Celsius = 0;
        double fahrnheit;

        System.out.print("Please enter the temperature in Celsius: ");

        String userInput = cakeObject.next();
        Celsius = Double.parseDouble(userInput);



        double fahrenheit = Celsius * 9 / 5 + 32;

        System.out.println("Fahrenheit:  " + fahrenheit);


    }

    public static void evenOrOdd() {

        System.out.println(" Enter an integer ");
        int number = cakeObject.nextInt();

        if (number % 2 == 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }

    public static void maxOfThree() {
        System.out.println(" Enter three integer: ");
        int m = cakeObject.nextInt();
        int a = cakeObject.nextInt();
        int c = cakeObject.nextInt();

        if (m >= a && m >= c) {
            System.out.println(m);
        } else if (a >= c) {
            System.out.println(a);
        } else {
            System.out.println(c);

        }


    }

    public static void factorial() {

        System.out.println("Enter a non-negative number (0 to 15)");
        int number = cakeObject.nextInt();
        if (number < 0 || number > 15) {
            System.out.println(" Invalid number:  Enter a number from 0 to 15");
        } else {
            long answer = 1;
            for (int i = 1; i <= number; i++) {
                answer = answer * i;

                System.out.println(number + "! = " + answer);
            }
        }
    }


    public static void multiplicationTable() {
        System.out.println("Enter a number:");
        int number = cakeObject.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void starTriangle() {

        System.out.print("Enter number of rows:");
        int row = cakeObject.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void isPrime() {
        System.out.println("Enter an integer greater than 1:");
        int num = cakeObject.nextInt();

        if (num <= 1) {
            System.out.println("Invalid number: Enter a number greater than 1.");
        } else {
            boolean prime = true;

            for (int i = 2; i <= num / i; i++) {

                if (num % i == 0) {

                    prime = false;

                    break;
                }
            }
            if (prime) {

                System.out.println(num + " is prime number.");
            } else {
                System.out.println(num + " is not prime number.");
            }
        }
    }

    public static void reverseNumber() {
        System.out.println("Enter a positive integer:");
        int num2 = cakeObject.nextInt();

        int reverse1 = 0;
        while (num2 > 0) {
            int digit = num2 % 10;
            reverse1 = reverse1 * 10 + digit;
            num2 = num2 / 10;
        }
        System.out.println("Reversed number = " + reverse1);
    }


    public static void numberPyramid() {
        System.out.println("Enter number of rows:");
        int rows = cakeObject.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}






















































































