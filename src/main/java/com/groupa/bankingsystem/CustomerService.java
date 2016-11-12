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

    private Map<Long, Customer> customers = DatabaseClass.getCustomers();
    
    public CustomerService(){
        customers.put(1L, new Customer(1, "conor","myaddress","myemail","mypassword"));
        customers.put(2L, new Customer(2, "dave","daveaddress","daveemail","davepassword"));
        customers.put(3L, new Customer(3, "kev","kevaddress","kevemail","kevpassword"));
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<Customer>(customers.values());

    }

    public Customer getCustomer(long id) {
        return customers.get(id);
    }

    public Customer addCustomer(Customer customer) {
        customer.setId(customers.size() + 1);
        customers.put(customer.getId(), customer);
        return customer;
    }

    public Customer updateCustomer(Customer customer) {
        if (customer.getId() <= 0) {
            return null;
        }
        customers.put(customer.getId(), customer);
        return customer;
    }

    public Customer removeCustomer(long id) {
        return customers.remove(id);
    }

}
