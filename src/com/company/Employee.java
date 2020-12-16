package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie


import java.io.IOException;
import java.util.Scanner;

public class Employee{
    // initialize scanner to collect input from the keyboard
    Scanner sc = new Scanner(System.in);
    // initialize variable
    int inputNumberFirst = 0;
    public Employee() throws IOException {
        //open do-while loop for menu option
        do {
            System.out.println("Please choose one option : 1.Creating customer | 2.Delete customer | 3.Lodge | 4.Withdraw | 5.List of customer");
            inputNumberFirst = sc.nextInt();
            // open if for menu option 1
            if (inputNumberFirst == 1) {
                //call customerinfo class
                CustomerInfo customerInfo = new CustomerInfo();
            }
            // open else if for menu option 2
            else if (inputNumberFirst == 2) {
                // initialize variable to get the customer information to delete account
                String firstName, lastName, inAccountCode, inPinNumber;
                System.out.println("Please input the customer's first name\t");
                firstName = sc.next();
                System.out.println("Please input the customer's last name\t");
                lastName = sc.next();
                System.out.println("Please input the customer's account code\t");
                inAccountCode = sc.next();
                System.out.println("Please input the customer's pin number\t");
                inPinNumber = sc.next();
                // call the deleteaccount class
                DeleteAccount deleteAccount = new DeleteAccount(firstName, lastName, inAccountCode, inPinNumber);
            }
            // open else if for menu option 3
            else if (inputNumberFirst  == 3){
                sc.nextLine();
                // initialize variable
                String firstName, lastName, inAccountCode, inPinNumber;
                System.out.println("Please input the customer's first name\t");
                firstName = sc.next();
                System.out.println("Please input the customer's last name\t");
                lastName = sc.next();
                System.out.println("Please input the customer's account code\t");
                inAccountCode = sc.next();
                System.out.println("Please input the customer's pin number\t");
                inPinNumber = sc.next();
                //call chek method in customerchek class
                CustomerCheck.check(firstName, lastName, inAccountCode, inPinNumber);
            }
            // open else if for menu option 4
            else if (inputNumberFirst  == 4){
                sc.nextLine();
                // initialize variable
                String firstName, lastName, inAccountCode, inPinNumber;
                System.out.println("Please input the customer's first name\t");
                firstName = sc.next();
                System.out.println("Please input the customer's last name\t");
                lastName = sc.next();
                System.out.println("Please input the customer's account code\t");
                inAccountCode = sc.next();
                System.out.println("Please input the customer's pin number\t");
                inPinNumber = sc.next();
                //call chek method in customerchek class
                CustomerCheck.check(firstName, lastName, inAccountCode, inPinNumber);
            }
            // open else if for menu option 5
            else if (inputNumberFirst  == 5){
                // call transaction class
                Transaction transaction3 = new Transaction();
                transaction3.CustomerList();
            }
        }
        while (inputNumberFirst < 1 && inputNumberFirst > 5);
        System.out.println("Exit");
        // close do-while loop
    }
}