package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie


import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);
    int inputNumberFirst = 0;




    public Employee(){

        do {
            System.out.println("Please choose one option : 1.Creating customer | 2.Delete customer | 3.Create Transaction");
            inputNumberFirst = sc.nextInt();

            if (inputNumberFirst == 1) {

                CustomerInfo customerInfo = new CustomerInfo();

            }
            else if (inputNumberFirst == 2) {

                String firstName, lastName, inaccountCode, inpinNumber;
                System.out.print("Please input the customer's first name\t");
                firstName = sc.nextLine();
                System.out.print("Please input the customer's last name\t");
                lastName = sc.nextLine();
                System.out.print("Please input the customer's account code (without '--')\t");
                inaccountCode = sc.nextLine();
                System.out.print("Please input the customer's first name\t");
                inpinNumber = sc.nextLine();

                DeleteAccount deleteAccount = new DeleteAccount(firstName, lastName, inaccountCode, inpinNumber);

            }
            else if (inputNumberFirst  == 3){

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
