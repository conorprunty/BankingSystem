/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.bankingsystem;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conorprunty
 */
@XmlRootElement
public class Customer {

    private long id;
    private String name;
    private String address;
    private String email;
    private String password;
    ArrayList<Account> account = new ArrayList<>();

    public Customer() {

    }

    public Customer(long id, String name, String address, String email, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public ArrayList<Account> getAccount() {
        return account;
    }

    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }
    
    public Account getAccountById(int accountId){
        return account.get(accountId);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
