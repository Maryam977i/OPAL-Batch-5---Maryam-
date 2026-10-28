
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class FeedbackPortal {


    static Scanner input = new Scanner(System.in);
    static String[] names = new String[100];
    static int[] ratings = new int[100];
    static String[] comments = new String[100];

    static int count = 0;

    public static void main(String[] args) {
        loadFeedback();
        int choice = 0;

        while (choice != 7) {

            showMenu();


            try {

                System.out.println("Choose: ");
                choice = Integer.parseInt(input.nextLine());


                switch (choice) {

                    case 1:
                        feedback();
                        break;

                    case 2:
                        showAll();
                        break;

                    case 3:
                         showAverage();
                        break;


                    case 4:
                        searchByRating();
                        break;


                    case 5:
                        deleteFeedback();
                        break;

                    case 6:
                        saveFeedback();
                        break;

                    case 7:
                        saveFeedback();
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Choose from 1 to 7.");


                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("===== CUSTOMER FEEDBACK PORTAL =====");
        System.out.println("1. Add feedback");
        System.out.println("2. Show all feedback");
        System.out.println("3. Show average rating");
        System.out.println("4. Search by rating");
        System.out.println("5. Delete feedback");
        System.out.println("6. Save to file");
        System.out.println("7. Save and exit");


    }


    public static void feedback() {

        // == mean equal to>> to compare between tow things
        if (count == names.length) {
            System.out.println(" Feedback list is full.");
            return;
        }

        System.out.println("Enter Customer name:");
        String name = input.nextLine();

        if (name.isEmpty()) {
            System.out.println(" name can not be empty.");
            return;
        }
        System.out.println(" Enter rating (1-5):");
        int rating;
        // try to swatch the code
        try {
            // Integer.parseInt must tne value are number from 1 to 5
            rating = Integer.parseInt(input.nextLine());

            // rating not less than 1 and not bigger than 5 use OR(||)
            if (rating <1 || rating > 5) {

                System.out.println(" Rating must be between 1 and 5");
                return;
            }
            // catch can found any error inside the try
        } catch (NumberFormatException e) {
            System.out.print(" please enter a valid number");
            return;

        }
        // that for write the comment
        System.out.println("Enter comment: ");
        String comment = input.nextLine();

        if (comment.isEmpty()) {

            System.out.println(" comment can not be empty");
            return;
        }
        // save data in array for the user
        names[count] = name;
        ratings[count] = rating;
        comments[count] = comment;

        // count increase by 1 everytime
        count++;

        System.out.println(" Feedback added successfully");


    }

    public static void showAll() {
// if no one write any feedback (=0) the output is No feedback available.
        if (count ==0){

            System.out.println(" No feedback available");
            return;
        }
// it starts from 0 and it repeats
        for (int i=0 ; i< count; i++){

            System.out.println("Name: " + names[i]);
            System.out.println("Rating: " + ratings[i]);
            System.out.println("Comment: " + comments[i]);


        }}


        public static void   showAverage() {

            if (count == 0) {

                System.out.println("no feedback available");
                // return:  stop the methode because they have no ratings
                return;
            }
            int total = 0;
            // gow this for loop work if the rating are 5,4,3>> then 0+5= 5 , 5+4=9 , 9+3=12

            for (int i = 0; i < count; i++) {
                // rating[i] because it is array
                total = total + ratings[i];

            }

            // to solve the average use double because have number like 3.6
            double average = (double) total / count;

            System.out.printf("Average rating: %.2f%n", average);
        }

        // this method allows staff to search for all feedback entries with a specific rating
        // instead of showing all feedback or searching by customer name.
        public static void  searchByRating() {

          int searchRating;



        try{
            // user inter the rating
            System.out.println(" Enter rating to search (1-5)");
         // user write the rating the code read the number in search
            searchRating = Integer.parseInt(input.nextLine());


        }catch(NumberFormatException e){

            System.out.println(" please enter valid number");
            return;
        }


        // now see if the number of rating is correct if user write number more than 5 the massage show  Enter rating to search (1-5)
         if(searchRating < 1 || searchRating > 5){

        System.out.println(" Rating must be between 1 and 5");
         return;

    }
         // if not found the result of  ratings
         boolean found = false;
         // search for all the rating  and see the rating one by one
         for ( int i=0; i<count; i++){

             if (ratings[i]== searchRating){

                 System.out.println("Name: " + names[i]);
                 System.out.println("Rating: " + ratings[i]);
                 System.out.println("Comment: " + comments[i]);
                 // found true if found the result of rating
                 found = true;


             }


         }
         //checks if no matching rating was found. If there is no match it displays a message.
         if (found == false){

             System.out.println(" No feedback found ");
         }







}
     //the worker can delete any rating they want for example have 3 rating they can delete one rate or tow
     public static void deleteFeedback() {

        // if have 0 ratings the output >>No feedback available to delete

         if (count ==0){
             System.out.println("No feedback available to delete ");
             return;

     }
         //show the sll ratings
         showAll();
         System.out.print(" Enter number to delete: ");
         // int number for store it
         int number;


     try {
         number = Integer.parseInt(input.nextLine());

     }catch (NumberFormatException e){

         System.out.println(" please enter a valid number");
         return;
     }
         // this code to know if the number is existing

         if( number <1 || number> count){
             System.out.println(" Invalid number");
             return;
         }
        // here to converting the number to index ... and index start with 0 >> that is why do this  number - 1
         int index = number - 1;

         // if delete one of rating the rating in the back can take place one of deleting rate
         for ( int i= index; i< count -1 ; i++){

             names[i] = names[i + 1];
             ratings[i] = ratings[i + 1];
             comments[i] = comments[i + 1];
         }
         // decrease the number because of deleting
         count--;

         System.out.println("Feedback deleted successfully.");
     }



public static void saveFeedback() {

// FileWriter help to open new file name feedback.txt so BufferedWriter help to write the text in file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("feedback.txt"))) {

        // see all the rating by use for loop
        for (int i = 0; i < count; i++) {

            //Write the data of ratings (names , ratings and comments)
            writer.write(names[i] + "|" + ratings[i] + "|" + comments[i]);
            // go to another line
            writer.newLine();
        }
        System.out.println("Feedback saved successfully.");
        writer.close();




        // if have any error in input and output the message will show error saving file
    } catch (IOException e) {

        // e.getMessage show the details of errors
        System.out.println("Error saving file: " + e.getMessage());
    }
}




    // This method loads saved feedback from a file (loadFeedback)
    public static void loadFeedback() {

        // open file and try to read line by line
        try (BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"))) {

            // store one line from the file ( feedback.txy)
            String line;

            // read line until the end of the file
            // != null mean we didn't finish read the end of the file
            while ((line = reader.readLine()) != null) {


                // if the output like Maryam|5|good this line to put the output like
                //- parts[0] = Maryam
                //- parts[1] = 5
                //- parts[2] = good
                String[] parts = line.split("\\|");

                // here store the name , rating and comment
                names[count] = parts[0];
                ratings[count] = Integer.parseInt(parts[1]);
                comments[count] = parts[2];
                count++;
            }


        }catch (NumberFormatException e) {
                System.out.println("Invalid rating in file.");


            //Handles file reading errors
        } catch (IOException e) {
            System.out.println("No saved feedback file found yet.");

        }
    }
}



































