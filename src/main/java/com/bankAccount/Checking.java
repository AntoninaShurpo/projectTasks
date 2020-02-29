package com.bankAccount;

class Checking implements IAccount {
    protected int amount;
    protected int bonus;
    protected int monthlyPay;

    public Checking(int amount, int monthlyPay, int bonus) {
        this.amount = amount;
        this.monthlyPay = monthlyPay;
        this.bonus = bonus;
    }

    @Override
    public double deposit() {
        return amount + bonus;
    }

    public double withdraw() {
        return amount - monthlyPay;
    }
}