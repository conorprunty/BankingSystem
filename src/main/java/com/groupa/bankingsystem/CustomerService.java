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

    public Account getAccount(String name) {
        return customers.get(name).getAccount();
    }

    public Customer addAccount(String name, Account account) {
        Customer cust = customers.get(name);
        if (cust.getAccount().getAccountId() == 0) {
            account.setAccountId(1);
        } else {
            account.setAccountId(cust.getAccount().getAccountId() + 1);
        }
        cust.setAccount(account);
        return customers.put(cust.getName(), cust);
    }

}
