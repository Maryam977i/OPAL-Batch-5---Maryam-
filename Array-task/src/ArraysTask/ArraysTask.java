package ArraysTask;

import java.io.PrintStream;
import java.util.Scanner;

public class ArraysTask {

    static Scanner arr = new Scanner(System.in);


    public static void main(String[] args) {
        // Array of number
        int[] numbers = {12, 7, 25, 3, 18, 9, 30, 14};

        // Frist:  Question 1 method
        int sum = sumArray(numbers);
        double average = averageArray(numbers);

        // Sec: Question 2 method

        int findMax = findMax(numbers);
        int findMin = findMin(numbers);

        // 3th: Question 3 method

        // how many event number in array
        int countEven = countEven(numbers);

        // reversed number in array
        int[] reversed = reverseArray(numbers);





        // Frist:  Question 1 method
        System.out.println("Sum: " + sum);
        System.out.println("average: " + average);

        // Sec: Question 2 method
        System.out.println("findMax: " + findMax);
        System.out.println("findMin: " + findMin);

        // Calculate and display the difference between max and min
        System.out.println("Difference:: " + (findMax - findMin));

        // 3th: Question 3 method
        System.out.println("Even numbers: " + countEven);
        System.out.println("Enter a number to search for " );

        int target = arr.nextInt();
        int indexOf = indexOf(numbers, target);
        if (indexOf != -1) {

            System.out.println(target + " found at index " + indexOf);
        } else {
            System.out.println(" not found " + target);

        }

        // 4th: Question 4 method
        System.out.print("Original:");
        printArray(numbers);

        System.out.print("Reversed:");
        printArray(reversed);

        // 5th: Question 5 method
        int[] grades = readGrades(5);
        int passed = countPassed(grades);
        int failed = grades.length - passed;
        System.out.println("passed: " + passed);
        System.out.println("failed: " +failed);






    }

    // Frist:  Question 1 method

    static int sumArray(int[] arr) {
        int sum = 0;


        for (int numb : arr) {
            sum = sum + numb;


        }

        return sum;

    }

    static double averageArray(int[] arr) {
        double average;
        int sum = sumArray(arr);


        return (double) sum / arr.length;


    }
// Sec: Question 2 method

    static int findMax(int[] arr) {

        int findMax = arr[0];
        int min = arr[0];

        for (int numb : arr) {
            if (numb > findMax) {
                findMax = numb;
            }
        }
        return findMax;


    }

    static int findMin(int[] arr) {
        int findMin = arr[0];
        int min = arr[0];

        for (int numb : arr) {
            if (numb < findMin) {
                findMin = numb;
            }
        }
        return findMin;
    }


// 3th:Complete Question 3 method


    static int countEven(int[] arr) {

        // Start count from 0
        int count = 0;

        // Visit each number in the array
        for (int numb : arr) {

            // An even number has a remainder of zero when divided by
            if (numb % 2 == 0) {

                //Increase by 1
                count++;
            }
        }

        return count;
    }


    static int indexOf(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;

            }
        }
        return -1;


    }


    // 4th: Question 4 method
    static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j= arr.length-1;

        for(int i=0; i<arr.length; i++){
            reversed[i] = arr[j];
            j--;


        }
        return reversed;






    }
    static void printArray(int[] arr) {


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");


        }
            System.out.println();

    }

    // 5th: Question 5 method
    static int[] readGrades(int size) {
        int[] grades = new int[size];
        int number = 1;

        for (int i = 0; i < size; i++) {

            System.out.println("Enter grade:" + number);
            grades[i] = arr.nextInt();
            number++;


        }
        return grades;
    }

        static int countPassed(int[] grades) {

            int count = 0;

            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 50) {
                    count++;
                }
            }
            return count;
        }}

























