package com.bankAccount;


public class Runner {
    public static void main(String[] args) {
        IAccount account = new Saving(100, 2, 36);
        print(account);
        account = new Checking(30, 1, 55);
        print(account);
        account = new CreditCard(12, 2, 37);
        print(account);
        account = new Privileged(109, 29, 38);
        print(account);
        account = new GooglePay(32, 2,5);
        print(account);
    }

    private static void print(IAccount account) {
        System.out.println("Deposit of " + account.getClass().getName() + " is equal to " +account.deposit());
        System.out.println("Withdraw is equal to " + account.getClass().getName() + " is equal to " + account.withdraw());
    }
}
