package com.example;

import java.util.ArrayList;

public class Account {

    private String accountName;
    public int balance =  0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();

    }

    public int getBalance() {
        return balance;
    }

    public void deposit (int ammount){

        if (ammount > 0){
            balance += ammount;
            System.out.println(ammount + " was deposited. Balance is now: " + this.balance);
        }else {
            System.out.println("cannot add negative sums");
        }

    }
    public void withdrawal(int ammount){
        int withdrawal = -ammount;
        if (withdrawal<0){
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(ammount + " withsrawn. Balance is now: " + this.balance);
        }else {
            System.out.println("Cnnot withdrawal negative numbers");
        }
    }
}
