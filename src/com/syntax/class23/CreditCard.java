package com.syntax.class23;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;

    }

    double calculateInterest() {
        return balance * interest;
    }

    public static void main(String[] args) {
        Visa visa = new Visa(100, 0.025);
        System.out.println(visa.calculateInterest());
        Ax ax = new Ax(100, 0.025);
        System.out.println(ax.calculateInterest());
    }

}
