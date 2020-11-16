package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.util.ArrayList;
import java.util.Scanner;

class CreatingCustomer {

    Scanner kb = new Scanner(System.in);
    private String fName, lName, eMail, firstUpperName, lastUpperName, fullName, firstLowerName, lastLowerName;

    public CreatingCustomer() {

        String sample = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.println("Please input the customer's first name.");
        fName = kb.next();
        System.out.println("Please input the customer's last name.");
        lName = kb.next();
        System.out.println("Please input the customer's email.");
        eMail = kb.next();
        fullName = fName + lName;
        firstUpperName = fName.toUpperCase();
        lastUpperName = lName.toUpperCase();
        firstLowerName = fName.toLowerCase();
        String a = String.valueOf(firstLowerName.charAt(0));
        lastLowerName = lName.toLowerCase();
        String b = String.valueOf(lastLowerName.charAt(0));
        String A = a+b;
        String B = String.valueOf(fullName.length());
        String C = String.valueOf((sample.indexOf(firstUpperName.charAt(0)))+1);
        String D = String.valueOf((sample.indexOf(lastUpperName.charAt(0)))+1);
        String newCustomerAccount = String.join("--",A,B,C,D);
        String pinCode = String.join("",C,D);
        System.out.println("Customer account - " + newCustomerAccount);
        System.out.println("Pin code - " + pinCode);


        Employee employee = new Employee();
    }

}




