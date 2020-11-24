package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.util.Scanner;


public class CreatingCustomer {

    public CreatingCustomer() {

        Scanner sc = new Scanner(System.in);
        String sample = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.print("Please input the customer's first name.\t");
        String fName = sc.nextLine();
        System.out.print("Please input the customer's last name.\t");
        String lName = sc.nextLine();
        System.out.print("Please input the customer's email.\t");
        String eMail = sc.nextLine();

        String fNameChange = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
        String lNameChange = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();

        String firstCode = fName.substring(0, 1).toLowerCase() + lName.substring(0, 1).toLowerCase();
        String secondCode = String.valueOf(fName.length() + lName.length());
        String thirdCode = String.valueOf((sample.indexOf(fNameChange.charAt(0))) + 1);
        String fourthCode = String.valueOf((sample.indexOf(lNameChange.charAt(0))) + 1);

        String accountCode = String.join("--", firstCode, secondCode, thirdCode, fourthCode);
        String pinNumber = String.join("", thirdCode, fourthCode);

        System.out.printf("Customer's account number is : %s and pin number is : %s\n", accountCode, pinNumber);

        System.out.print("Please input the customer's current account balance.\t");
        String currentAccountBalance = sc.nextLine();
        System.out.print("Please input the customer's saving account balance.\t");
        String savingAccountBalance = sc.nextLine();


        try{

        }catch (Exception e){

        }

        Employee employee = new Employee();
    }
}
























