package com.bankAccount;

public class CreditCard implements IAccount{
    protected int amount;
    protected int bonus;
    protected int interest;

    public CreditCard(int amount, int interest, int bonus) {
        this.amount = amount;
        this.interest = interest;
        this.bonus = bonus;
    }

    @Override
    public double deposit() {
        return amount + bonus;
    }

    public double withdraw() {
        return amount * interest;
    }
}