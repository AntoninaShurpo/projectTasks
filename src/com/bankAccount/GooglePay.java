package com.bankAccount;

 class GooglePay extends CreditCard{
     public GooglePay(int amount, int interest, int bonus) {
         super(amount, interest, bonus);
     }

     @Override
     public double deposit() {
         return super.deposit() * interest + bonus;
     }

     @Override
     public double withdraw() {
         return super.withdraw() * interest - bonus;
     }
 }
