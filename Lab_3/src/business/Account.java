/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Date;

/**
 *
 * @author hyZHO
 */
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createOn;
    
    public Account(){
        this.createOn = new Date();
        //回去看这里讲了什么
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreateOn() {
        return createOn;
    }//为什么date只有getter
    
    @Override
    public String toString(){
        return bankName;
    }
    
}
