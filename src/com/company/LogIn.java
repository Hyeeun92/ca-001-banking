package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.io.IOException;
import java.util.Scanner;

public class LogIn {

    public LogIn() throws IOException {
        // initialize scanner to collect input from the keyboard
        Scanner sc = new Scanner(System.in);
        // initialize variables
        int inputNumber;
        String inputPin = "";
        final String pinNumber = "A1234";
        String firstName, lastName, accountCode, customerPinNumber;
        // open do-while loop for menu option
        do {
            // showing the option to the users
            System.out.println("Please choose one option : 1.Bank Employee | 2.Customer");
            // receiving option from the users
            inputNumber = sc.nextInt();
            // checking option
            if (inputNumber == 1) {
                // open do-while loop to match employee pin number
                do {
                    System.out.println("Pleas input the pin number.");
                    inputPin = sc.next();
                }
                while (inputPin == pinNumber);
                System.out.println("You are successfully logged in as an employee");
                // close do-while loop
                Employee employee = new Employee();
                // open if for customer to ask the first name, last name , account code, pin number
            } else if (inputNumber == 2) {
                sc.nextLine();
                System.out.println("Please enter your first name \t");
                firstName = sc.nextLine();
                System.out.println("Please enter your last name \t");
                lastName = sc.nextLine();
                System.out.println("Please enter your account code \t");
                accountCode = sc.nextLine();
                System.out.println("Please enter your pin number \t");
                customerPinNumber = sc.nextLine();
                // match the information from the user to data
                CustomerCheck.check(firstName, lastName, accountCode, customerPinNumber);
                //open if for exit option
            }
        }
        while (inputNumber < 1 && inputNumber > 2) ;
        // finish do-while for menu
    }
}