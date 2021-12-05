package com.syntax.class13;

public class Account {
    String accountId;
    String username;
    String password;
    double balance;
    double limit;
    int amount;
    String typeOfAccount;
    void transfer(int amount)
    {
        if (amount>balance){
            System.out.println("Sorry you don't have balance!!");
        }else{
            balance=balance-amount;
            System.out.println(amount+" will be transferred over");
            //return balance;
        }
    }

    boolean login(String enteredUsername, String enteredPassword)
    {
        if(username.equals(enteredUsername) && password.equals(enteredPassword))
        {
            return true;

        }else{
            return false;
        }

    }
}
