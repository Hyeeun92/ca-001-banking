package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CustomerCheck extends Account{
    // call the scanner to get the data from user keyboard
    Scanner sc = new Scanner(System.in);

    public static void check(String firstName, String lastName, String accountCode, String customerPinNumber) throws IOException{
        // declare variable for data that come from user
        String getFName = firstName;
        String getLName = lastName;
        String gAccountCode = accountCode;
        String gPinNumber = customerPinNumber;
        File(gAccountCode);
        // initialize the function to check user data
        checkCustomer(getFName, getLName, gAccountCode, gPinNumber);
    }

    public static void checkCustomer(String getFName, String getLName, String gAccountCode, String gPinNumber) throws IOException{
        // declare variable for data from saved file
        String firstName = "";
        String lastName = "";
        String accountCode = "";
        String pinNumber = "";
        String eMail = "";
        double currentBalance = 0.0;
        double savingBalance = 0.0;
        // set the file to read data
        File customerFile = new File("customers.txt");
        //open try-catch to call the data from file
        try {
            // declare system scanner to read data from file
            Scanner sc = new Scanner(customerFile);
            // define the parameter to get data
            sc.useDelimiter("[,\n]");
            // open while to get data from file
            while (sc.hasNext()) {
                // implement data
                firstName = sc.next();
                lastName = sc.next();
                accountCode = sc.next();
                pinNumber = sc.next();
                eMail = sc.next();
                currentBalance = sc.nextDouble();
                savingBalance = sc.nextDouble();
            }
        }catch (IOException e){

        }
        // open if to check if it is match
        if (firstName.equals(getFName) && lastName.equals(getLName) && accountCode.equals(gAccountCode) && pinNumber.equals(gPinNumber)){
            BankCustomer bankCustomer = new BankCustomer(gAccountCode);
        } else{
            System.out.println("Please check one more");
        }
    }
}