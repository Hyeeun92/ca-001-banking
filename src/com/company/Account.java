package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Account {


    public static void Account(){
        String fileName = "customers.txt";
        ArrayList listOfCustomer = new ArrayList();
        int length = 0;
        String dataIn, fNameIn, lNameIn, accountCodeIn, pinNumberIn, eMailIn, currentBalanceIn, savingBalanceIn;


        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(fileReader);
            String reader = new String();

            while(reader !=null){
                reader = buffer.readLine();
                if(reader == null) break;
                length ++;
                String[] list = reader.split(",");

                dataIn = list[0];
                fNameIn = list[1];
                lNameIn = list[2];
                accountCodeIn = list[3];
                pinNumberIn = list[4];
                eMailIn = list[5];
                currentBalanceIn = list[6];
                savingBalanceIn = list[7];

                listOfCustomer.add(list);

            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }




}








