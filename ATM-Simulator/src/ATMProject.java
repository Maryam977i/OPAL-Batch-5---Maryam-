package Project;

import java.util.Scanner;

public class ATMProject {
    static Scanner cakeObject = new Scanner(System.in);
    static double balance = 1000.00;

    static double depositTotal = 0.0;
    static int depositCount = 0;

    static double withdrawalTotal = 0.0;
    static int withdrawalCount = 0;

    static int pin = 1234;
    static int newPassword;



    public static boolean login() {

        // Allow the user to enter the PIN up to 3 times
        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter PIN");
            int pin = cakeObject.nextInt();

            // the password is 1234 if write correct print welcome
            if (pin == 1234) {
                System.out.println("Welcome!");
                return true;

                 // if write pin wrong print Wrong PIN. try again
            } else if (i < 3) {
                System.out.println("Wrong PIN. try again: " + (3 - i));

                // if write pin more 3 time with wrong pin it print  Card locked
            } else {
                System.out.println("Card locked");
                return false;
            }
        }

        return false;
    }




        public static void main(String[] args) {

                if (login()) {

                    int atm;

                    do {
                        atm = menu();

                    }
                    while (atm != 0);
                }

                cakeObject.close();
            }



    public static int menu() {

        // print menu after write correct pin and show everytime when end chose one number in menu
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Account tier");
        System.out.println("5. Savings projection");
        System.out.println("6. Receipt summary");
        System.out.println("7. Change PIN");
        System.out.println("0. Exit");


        int atm = cakeObject.nextInt();

        switch (atm) {

            case 1:
                checkBalance();
                break;

            case 2:
                deposit();
                break;

            case 3:
                withdraw();
                break;


            case 4:
                accountTier();
                break;


            case 5:
                savingsProjection();
                break;

            case 6:
                receiptSummary();
                break;

            case 7:
                changePin();
                break;


            case 0:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println(" Invalid app. Please try again");

        }

        return atm;
}



    public static void   checkBalance() {
        // Display the current account balance
        System.out.println ("Balance: " + balance);


}




    public static void deposit() {

        System.out.println("Enter deposit amount");
        double amoun = cakeObject.nextDouble();

        //First check if deposit is zero or nigt
        if (amoun<=0) {
            System.out.println(" amount  must be grater than 0 ");

        }
        // must the deposit not more than 5000
        else if(amoun >5000) {
            System.out.println(" Mix is 5000 ");

        }
        else{
            //else add the amount with the balance
            balance = balance + amoun;
            System.out.println("Balance: " + balance);

            // Increase the number of deposits by one .. start from 0 and increasing by 1 each time.
            depositCount++;

            //and add the depositTotal with the amoun
            depositTotal = depositTotal +amoun;




        }


    }



    public static void withdraw() {
        System.out.println("Enter withdrawal amount");
        double amount = cakeObject.nextDouble();

        //First check if withdrawal is zero or nigt
        if (amount <= 0) {
            System.out.print(" amount  must be grater than 0");
        }
        //Check if the amount is not a multiple of 10 must be more
            else if (amount %10 != 0) {

            System.out.print(" amount  must be multple than 10");
        }
         else {
             // the  withdrawal fee is 2.00
            double fee = 2.00;

            // increase the fee to 5.00 if the amount is greater than 500
            if (amount > 500) {
                fee = 5.00;
            }
            // here check if balance is  enough to cover both amount and fee
            if (balance >= amount + fee) {
                //We subtract(-) the withdrawal amount and fee from the balance to calculate the remaining money after the withdrawal.
                balance = balance - amount - fee;
                withdrawalCount++;
                //We use it to calculate the total amount withdrawn from the account and  all successful withdrawals.
                withdrawalTotal = withdrawalTotal + amount;

            }

            System.out.println("Fee: " + String.format("%.2f", fee));
            System.out.println("Withdrawal successful. Balance: " + balance);


        }}


public static void  accountTier() {

    // if the balance is less than 1000 ..print Tier: Bronze, interest rate: 1%
    if  ( balance< 1000) {
        System.out.println(" Tier: Bronze, interest rate: 1% ");
    }
    // if the balance is less than 5000.. print Tier: Silver, interest rate: 2%
        else if ( balance< 5000) {
        System.out.println(" Tier: Silver, interest rate: 2% ");
    }
    // if the balance is less than 20000.. print Tier:  Gold, interest rate: 3%
    else if ( balance< 20000) {
        System.out.println(" Tier:  Gold, interest rate: 3% ");
    }
    // if the balance is 20000 or more .. print Platinum, interest rate: 4%
    else {
        System.out.println(" Tier: Platinum, interest rate: 4% ");


    }
    }

    public static void savingsProjection() {
        System.out.println("Enter number of years");
        int years = cakeObject.nextInt();

        // years between 1 and 10 only we can see only for 10 years  not less than one and not big than 10
        if (years < 1 || years > 10) {

            System.out.println("Years must be between 1 and 10");

        } else {
            //interest rate to 2% for the calculation
            double rate = 2;

            double salary = balance;
            // Repeat the calculation once for each year entered by the user
            for (int i = 1; i <= years; i++) {

                // Calculate 2%  based on the balance(1000) and add it to that balance
                salary  = salary  + (salary  * rate / 100);

                System.out.printf("Year %d: %.2f%n", i, salary );
            }


        }}
    public static void  receiptSummary() {

        // Use "%.2f" to display the result like 0.00
        System.out.println("Deposits: " + depositCount + ", total: " + String.format("%.2f", depositTotal));

        System.out.println("Withdrawals: " + withdrawalCount + ", total: " + String.format("%.2f", withdrawalTotal));

        System.out.println("Balance: " + String.format("%.2f", balance));



    }


public static void  changePin () {


    // use for loop : Repeat the code 4 times ...start from 1 and increase  i by 1 each time.
    for (int i = 1; i <= 4; i++) {
        System.out.println("Enter old PIN");
        int old = cakeObject.nextInt();

        if (old == pin) {
            System.out.println("Enter new PIN");

            int newPassword = cakeObject.nextInt();

            System.out.println("Confirm PIN");

            // read an integer entered by the user and store it in the variable
            int confirm = cakeObject.nextInt();

            // password must be around 1000 to 9999 and only 4 digits
            if (newPassword >= 1000 && newPassword <= 9999 && newPassword == confirm) {

                pin = newPassword;

                System.out.println("PIN changed");

            } else {

                System.out.println("Invalid PIN");
            }
            return;

        } else {
            System.out.println("Wrong PIN");
        }
    }}}






































