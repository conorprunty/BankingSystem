/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.bankingsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author conorprunty
 */
public class DatabaseClass {

    public static Map<String, Customer> customers = new HashMap<>();

    public static Map<String, Customer> getCustomers() {
        return customers;
    }

}
