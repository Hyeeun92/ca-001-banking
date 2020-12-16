package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.io.IOException;
import java.util.Scanner;

public class BankCustomer {

    public BankCustomer(String gAccountCode) throws IOException {
        // declare variable for option
        int option = BankCustomer.customerMenu();
        // open do-while for option
        do {
            // use switch for each option
            switch (option) {
                case 1:
                    Transaction transaction1 = new Transaction();
                    transaction1.Lodge(gAccountCode);
                    break;
                case 2:
                    Transaction transaction2 = new Transaction();
                    transaction2.Withdraw(gAccountCode);
                    break;
                case 3:
                    Transaction transaction3 = new Transaction();
                    transaction3.transactionHistory(gAccountCode);
                    break;
            }
        } while( option > 0 && option < 4);
    }
    private static int customerMenu(){
        // initialize variable for option
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose one option : 1.Make transaction-Lodge | 2.Make transaction-Withdraw | 3.Check transaction history");
        selection = sc.nextInt();
        return selection;
    }

}
