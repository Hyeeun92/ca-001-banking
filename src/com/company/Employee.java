package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.util.Scanner;

public class Employee {

    int selectFunction;
    Scanner kb = new Scanner(System.in);
    int inputNumberFirst = 0;

    public Employee(){
        do {
            System.out.println("Please choose one option : 1.Create customer | 2.Delete customer | 3.Create Transaction");
            inputNumberFirst = kb.nextInt();

            if (inputNumberFirst == 1) {
                CreatingCustomer creatingCustomer = new CreatingCustomer();
            }
            if (inputNumberFirst == 2) {

            }

        } while (inputNumberFirst < 1 && inputNumberFirst > 3);


    }



    //create and delete customers
    //new customer get saving account and current account
    //can delete customer who have zero balance
    //can create transactions (lodge,deposit) for customer - able to add and withdraw for a specified account
    //menu item allowing to list customers their account numbers
    //show a complete list of customer including their balance in savings and current account


}
