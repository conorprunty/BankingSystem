/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.bankingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author conorprunty
 */
public class CustomerService {

    private Map<String, Customer> customers = DatabaseClass.getCustomers();

    public CustomerService() {
        customers.put("conor", new Customer(1, "conor", "myaddress", "myemail", "mypassword"));
        customers.put("dave", new Customer(2, "dave", "daveaddress", "daveemail", "davepassword"));
        customers.put("kev", new Customer(3, "kev", "kevaddress", "kevemail", "kevpassword"));

    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<Customer>(customers.values());

    }

    public Customer getCustomer(String name) {
        return customers.get(name);
    }

    public Customer addCustomer(Customer customer) {
        customer.setId(customers.size() + 1);
        customers.put(customer.getName(), customer);
        return customer;
    }

    public Customer updateCustomer(Customer customer) {
        if (customer.getName().isEmpty()) {
            return null;
        }
        customers.put(customer.getName(), customer);
        return customer;
    }

    public Customer removeCustomer(String name) {
        return customers.remove(name);
    }

    public ArrayList<Account> getAccount(String name) {
        return new ArrayList<>(customers.get(name).getAccount());
    }

    public Customer addAccount(Customer customer, Account account) {
        if (customer.getAccount().isEmpty()) {
            account.setAccountId(1);
        } else {
            account.setAccountId(customer.getAccount().size() + 1);
        }
        customer.getAccount().add(account);
        customers.put(customer.getName(), customer);
        return customer;
    }
    
    public Account updateAccountBalance(Customer customer, int accountId, int amount){
        customer.getAccountById(accountId).setBalance((customer.getAccountById(accountId).getBalance())+amount);
        customers.put(customer.getName(), customer);
        return customer.getAccountById(accountId);
    }
    
    public Account getAccountById(Customer customer, int accountId){
        return customer.getAccountById(accountId);       
    }
}
