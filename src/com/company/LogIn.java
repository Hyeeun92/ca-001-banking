package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.util.Scanner;

public class LogIn {

    public LogIn() {

        Scanner kb = new Scanner(System.in);
        int inputNumber;
        String inputPin = "";
        final String pinNumber  = "A1234";


        do {

            System.out.println("Please choose one option : 1.Bank Employee | 2.Customer | 3.Exit");
            inputNumber = kb.nextInt();

            if (inputNumber == 1) {

                do {
                    System.out.println("Pleas input the pin number.");
                    inputPin = kb.next();

                }
                while (inputPin == pinNumber);
                System.out.println("You are successfully logged in as an employee" + "");

                Employee employee = new Employee();

            } else if (inputNumber == 2) {


                CustomerCheck customercheck = new CustomerCheck();

            } else if (inputNumber == 3) {
                System.out.println("Exit");
            }
        } while (inputNumber < 1 || inputNumber > 3);
    }

}
