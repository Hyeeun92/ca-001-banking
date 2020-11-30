package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerCheck extends Account {
    //login - enter name, account code and pin number
    //can retrieve transaction history for specified account
    //add and subtract money to either saving account or current account
    //cannot have negative balance

    Scanner sc = new Scanner(System.in);

    public CustomerCheck() {

        String firstName, inaccountCode, pinNumber;

        do {
            System.out.print("Please input your first Name");
            firstName = sc.nextLine();
            System.out.print("Please input your account code");
            inaccountCode = sc.nextLine();
            System.out.print("Please input your pin number");
            pinNumber = sc.nextLine();

        } while (true);



    }

}
