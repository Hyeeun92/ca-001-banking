package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.io.*;
import java.util.Scanner;

public class DeleteAccount extends Account{
    //
    Scanner sc = new Scanner(System.in);
    public DeleteAccount(String firstName, String lastName, String inAccountCode, String inPinNumber) throws IOException{
        //initialize method
        File(inAccountCode);
        FinedInfo(firstName, lastName, inAccountCode, inPinNumber);
    }

    public static void FinedInfo(String firstName, String lastName, String inAccountCode, String inPinNumber) throws IOException {
        // initialize Bufferereader to read from file
        BufferedReader reader = new BufferedReader(new FileReader(readFromCustomer));
        // initialize variable
        String line = null;
        String fName, lName, aCode,pNumber,eMail;
        double currentB, savingB;
        // open while to read from file by line
        while((line=reader.readLine())!=null){
            // splite data by ","
            String[] info = line.split(",");
            aCode = info[2];
            // open if to check with data if account code matched or not
            if (inAccountCode.equals(aCode)){
                // implement data from file
                fName = info[0];
                lName = info[1];
                pNumber = info[3];
                eMail = info[4];
                currentB = Double.parseDouble(info[5]);
                savingB = Double.parseDouble(info[6]);
                // open if to check if data is matched
                if (fName.equals(firstName) && lName.equals(lastName) && aCode.equals(inAccountCode) && pNumber.equals(inPinNumber) && currentB == 0.0 && savingB == 0.0){
                    // call method to delete data
                    delete(inAccountCode,readFromSav);
                    delete(inAccountCode,readFromCur);
                    deleteInList(inAccountCode,readFromCustomer);
                }
            }
        }
    }

    private static void deleteInList(String inAccountCode, String readFromCustomer) {
        String samFile = "sample.txt";
        File oldFile = new File(readFromCustomer);
        // create new file to replace file
        File newFile = new File(samFile);
        // declare variables
        String fName = "";
        String lName = "";
        String accountCode = "";
        String pinNumber = "";
        String eMail = "";
        String currentBalance = "";
        String savingBalance = "";
        // open try-catch to write data to new file
        try{
            FileWriter fr= new FileWriter(samFile, true);
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pw = new PrintWriter(br);
            Scanner sc = new Scanner(new File(readFromCustomer));
            sc.useDelimiter("[,\n]");
            // open while to read from file
            while(sc.hasNext()){
                fName = sc.next();
                lName = sc.next();
                accountCode = sc.next();
                pinNumber = sc.next();
                eMail = sc.next();
                currentBalance = sc.next();
                savingBalance = sc.next();
                // open if to check accunt code from data
                if(accountCode.equals(inAccountCode)) {
                    // open if to write the new data to file
                    if (sc.hasNext()) {
                        fName = sc.next();
                        lName = sc.next();
                        accountCode = sc.next();
                        pinNumber = sc.next();
                        eMail = sc.next();
                        currentBalance = sc.next();
                        savingBalance = sc.next();
                        pw.print(fName + "," + lName + "," + accountCode + "," + pinNumber + "," + eMail + "," + currentBalance + "," + savingBalance + "\n");
                    } else {
                        pw.print("");
                    }
                }
                // open else to write the data to file that do not need to changed
                else {
                    pw.print(fName + "," + lName + "," + accountCode + "," + pinNumber + "," + eMail + "," + currentBalance + "," + savingBalance + "\n");
                }
            }
            // close scanner
            sc.close();
            // cleaning memory
            pw.flush();
            // close printwriter
            pw.close();
            // delete previous file
            oldFile.delete();
            File newFileName = new File(readFromCustomer);
            // change the new file name to old file name
            newFile.renameTo(newFileName);
        }
        catch (Exception e){

        }
    }

    private static void delete(String inAccountCode, String File) {
        // open try-catch to delete file
        try{
            File file = new File(File);
            file.delete();

        }catch(Exception e){

        }
    }
}
