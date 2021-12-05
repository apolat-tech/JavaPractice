package com.syntax.class13;

import java.util.Scanner;

public class bankApplication {
    public static void main(String[] args) {
        Account accountAli=new Account();
        accountAli.accountId="571";
        accountAli.username="apolat";
        accountAli.password="gel";
        accountAli.balance=1000;
        accountAli.typeOfAccount="Checking";
        boolean isLoggedIn=accountAli.login("ali","pol");
        System.out.println(isLoggedIn);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the amount that you want to transfer");
        accountAli.amount= scan.nextInt();
        accountAli.transfer(accountAli.amount);
        System.out.println("Your new balance is "+ accountAli.balance);
    }
}
