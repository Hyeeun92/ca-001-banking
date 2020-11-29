package com.company;

// 21545 Hyeeun Lee
// 21545@student.dorset-college.ie


public abstract class Account {


    private String fNameChange, lNameChange, accountCode, pinNumber, eMail;
    private double currentBalance;
    private double savingBalance;

    public String getfNameChange() {
        return fNameChange;
    }

    public void setfNameChange(String fNameChange){
        this.fNameChange = fNameChange;
    }

    public String getlNameChange(){
        return lNameChange;
    }

    public void setlNameChange(String lNameChange){
        this.lNameChange = lNameChange;
    }

    public String geteMail(){
        return eMail;
    }

    public void seteMail(String eMail){
        this.eMail = eMail;
    }

    public String getAccountCode(){
        return accountCode;
    }

    public void setAccountCode(String accountCode){
        this.accountCode = accountCode;
    }

    public String getPinNumber(){
        return pinNumber;
    }

    public void setPinNumber(String pinNumber){
        this.pinNumber = pinNumber;
    }


}








