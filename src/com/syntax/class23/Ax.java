package com.syntax.class23;

public class Ax extends CreditCard {
    double balance;
    double interest;

    Ax(double balance, double interest) {
        super(balance, interest);
    }

    double calculateInterest() {
        return super.balance * super.interest*0.2;
    }
}

