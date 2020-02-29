package com.bankAccount;

public class Privileged implements IAccount {
    protected int amount;
    protected int bonus;
    protected int reward;

    public Privileged(int amount, int bonus, int reward) {
        this.amount = amount;
        this.bonus = bonus;
        this.reward = reward;
    }


    @Override
    public double deposit() {
        return amount + bonus + reward;
    }

    @Override
    public double withdraw() {
        return 0;
    }
}
