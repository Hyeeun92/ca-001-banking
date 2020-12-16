package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.time.LocalDate;
import java.util.Scanner;
import java.io.*;

public class CustomerInfo {
    // accessing the date from the system
    LocalDate localDate = LocalDate.now();

    public CustomerInfo() throws IOException{
        // initialize scanner to collect input from the keyboard
        Scanner sc = new Scanner(System.in);
        // initialize variation to make the account code
        String sample = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.print("Please input the customer's first name.\t");
        String fName = sc.nextLine();
        System.out.print("Please input the customer's last name.\t");
        String lName = sc.nextLine();
        System.out.print("Please input the customer's email.\t");
        String eMail = sc.nextLine();
        // change the name firs letter to upper case and rest of them as lower case
        String fNameChange = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
        String lNameChange = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();
        // create the account code and pin number with customer information
        String firstCode = fName.substring(0, 1).toLowerCase() + lName.substring(0, 1).toLowerCase();
        String secondCode = String.valueOf(fName.length() + lName.length());
        String thirdCode = String.valueOf((sample.indexOf(fNameChange.charAt(0))) + 1);
        String fourthCode = String.valueOf((sample.indexOf(lNameChange.charAt(0))) + 1);
        String accountCode = String.join("-", firstCode, secondCode, thirdCode, fourthCode);
        String pinNumber = String.join("", thirdCode, fourthCode);
        // print and check customer number and pin number
        System.out.printf("Customer's account number is : %s and pin number is : %s\n", accountCode, pinNumber);
        // initialize variable for current account and saving account
        double savingBalance = 0.0;
        double currentBalance = 0.0;
        // open try-catch to create file
        try {
            // create the customer.txt to save information and save inforamtion in file
            FileWriter fw = new FileWriter("customers.txt", true);
            BufferedWriter customerList = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(customerList);
            // print the information in the file
            pw.print(fNameChange  + "," + lNameChange + "," + accountCode+ "," + pinNumber + "," + eMail + "," +  currentBalance + ","+ savingBalance + "\n");
            // close printwriter pw
            pw.close();
            // create file for saving account
            FileWriter saving = new FileWriter(accountCode + "-saving.txt", true);
            BufferedWriter s = new BufferedWriter(saving);
            PrintWriter pws = new PrintWriter(s);
            // save information in the file that already created
            pws.print(localDate + "," + "Created" + "," + "0.0" + "," + savingBalance + "\n");
            //close pws
            pws.close();
            // create file for current account and save information
            FileWriter current = new FileWriter(accountCode + ".current.txt", true);
            BufferedWriter c = new BufferedWriter(current);
            PrintWriter pwc = new PrintWriter(c);
            // save information in the file
            pwc.print(localDate + "," + "Created" + "," + "0.0" + "," + currentBalance + "\n");
            // close pw
            pwc.close();
        //catch for error
        } catch (
                IOException e) {
            // print the error message for error
            System.out.println("Error");
        }
    }
}
