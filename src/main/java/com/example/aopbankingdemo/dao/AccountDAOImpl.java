
package com.example.aopbankingdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Override
    public void addAccount() {
        System.out.println("Adding a new bank account");
    }

    @Override
    public void depositMoney() {
        System.out.println("Depositing money into account");


            /*throw new RuntimeException("Deposit failed"); */
        }


    @Override
    public void withdrawMoney() {
        System.out.println("Withdrawing money from account");
    }
}
