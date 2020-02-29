package com.bankAccount;

public class Saving implements IAccount {
    protected int amount;
    protected int bonus;
    protected int monthlyInterest;

    public Saving(int amount, int monthlyInterest, int bonus) {
        this.amount = amount;
        this.monthlyInterest = monthlyInterest;
        this.bonus = bonus;
    }

    @Override
    public double deposit() {
        return amount + bonus;
    }

    public double withdraw() {
        return amount * monthlyInterest;
    }


}
