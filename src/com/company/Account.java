package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public abstract class Account {
    // declare global variable
    public static String line, firstNameF, lastNameF, pinNumberF, eMailF, accountCodeF, dateF, actionF;
    public static double currentBF, savingBF;
    public static double balanceF, lastTransaction;
    public static String readFromSav;
    public static String readFromCur;
    public static String readFromCustomer;
    private static Scanner s;

    public static void File(String gAccountCode){
        //declare variable for file
        String sType = "-saving.txt";
        String cType = ".current.txt";
        readFromCustomer = "customers.txt";
        readFromCur = gAccountCode + cType;
        readFromSav = gAccountCode + sType;
    }
    public static void inFile(String Filepath) throws IOException {
        // initialize BufferedReader to read from file
        BufferedReader reader = new BufferedReader(new FileReader(Filepath));
        // initialize line = null
        line = null;
        //open while to read the file
        while((line=reader.readLine())!=null){
            // implement the information
            String[] accountData= line.split(",");
            // open if for information from file
            if (Filepath == readFromCustomer){
                //implement data
                firstNameF = accountData[0];
                lastNameF = accountData[1];
                accountCodeF = accountData[2];
                pinNumberF = accountData[3];
                eMailF = accountData[4];
                currentBF = Double.parseDouble(accountData[5]);
                savingBF = Double.parseDouble(accountData[6]);
            }
            // open if for information from file that another size
            else if (Filepath == readFromCur){
                // implement data
                dateF = accountData[0];
                actionF = accountData[1];
                lastTransaction = Double.parseDouble(accountData[2]);
                currentBF = Double.parseDouble(accountData[3]);
            }
            else if (Filepath == readFromSav){
                // implement data
                dateF = accountData[0];
                actionF = accountData[1];
                lastTransaction = Double.parseDouble(accountData[2]);
                savingBF = Double.parseDouble(accountData[3]);
            }
        }
    }

    public static void reWriteFileCur(String File, String gAccountCode, double currentBF){
        // declare variable and create a file for new information
        String samFile = "newFile.txt";
        File oldFile = new File("customer.txt");
        // create the new file to replace the previous file
        File newFile = new File(samFile);
        // declare variable to read from file
        String newAccount = "";
        String newFName = "";
        String newLName = "";
        String newEmail = "";
        String newPinNumber = "";
        String newCurrentBalance = "";
        String newSavingBalance = "";
        // open try-catch ro read from file
        try {
            FileWriter fw = new FileWriter(samFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            // scanner to read from file
            s = new Scanner(new File(File));
            // determine the parameters for data
            s.useDelimiter("[,\n]");
            // open while to get information from file
            while (s.hasNext()) {
                newFName = s.next();
                newLName = s.next();
                newAccount = s.next();
                newPinNumber = s.next();
                newEmail = s.next();
                newCurrentBalance = s.next();
                newSavingBalance = s.next();
                // open if to check the account code is matched with data
                if (newAccount.equals(gAccountCode)) {
                    // update data
                    pw.print(newFName + "," + newLName + "," + newAccount + "," + newPinNumber + "," + newEmail + "," + currentBF + "," + newSavingBalance + "\n");
                } else {
                    // rewrite the file that do not need to chang
                    pw.print(newFName + "," + newLName + "," + newAccount + "," + newPinNumber + "," + newEmail + "," + newCurrentBalance + "," + newSavingBalance + "\n");
                }
            }
            // close s
            s.close();
            // clean the memory
            pw.flush();
            // close pw
            pw.close();
            // delete old file
            oldFile.delete();
            // get the path of the file
            File sample = new File(File);
            // change the name of new file to old file
            newFile.renameTo(sample);
        }
        catch (Exception e){
        }
    }

    public static void reWriteFileSav(String File, String gAccountCode, double savingBF){
        // declare variable and create a file for new information
        String samFile = "newFile.txt";
        File oldFile = new File("customer.txt");
        // create the new file to replace the previous file
        File newFile = new File(samFile);
        // declare variable to read from file
        String newAccount = "";
        String newFName = "";
        String newLName = "";
        String newEmail = "";
        String newPinNumber = "";
        String newCurrentBalance = "";
        String newSavingBalance = "";
        // open try-catch ro read from file
        try {
            FileWriter fw = new FileWriter(samFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            // scanner to read from file
            s = new Scanner(new File(File));
            // determine the parameters for data
            s.useDelimiter("[,\n]");
            // open while to get information from file
            while(s.hasNext()){
                newFName = s.next();
                newLName = s.next();
                newAccount = s.next();
                newPinNumber = s.next();
                newEmail = s.next();
                newCurrentBalance = s.next();
                newSavingBalance = s.next();
                    // open if to check account code it matched data
                    if (newAccount.equals(gAccountCode)){
                        // update data
                        pw.print(newFName + "," + newLName + "," + newAccount + "," + newPinNumber + "," + newEmail + "," + newCurrentBalance + "," + savingBF + "\n");
                    }
                    else {
                        // rewrite the file that do not need to chang
                        pw.print(newFName + "," + newLName + "," + newAccount + "," + newPinNumber + "," + newEmail + "," + newCurrentBalance + "," + newSavingBalance + "\n");
                    }
                }
            // close s
            s.close();
            // clean the memory
            pw.flush();
            // close pw
            pw.close();
            // delete old file
            oldFile.delete();
            // get the path of the file
            File sample = new File(File);
            // change the name of new file to old file
            newFile.renameTo(sample);
        }
        catch (Exception e){
        }
    }
}

