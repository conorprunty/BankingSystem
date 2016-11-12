/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.bankingsystem;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author conorprunty
 */
@Path("/customer")
public class CustomerResource {

    CustomerService customerService = new CustomerService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getCustomer() {
        return customerService.getAllCustomers();
    }

    @GET
    @Path("/{customerId}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomer(@PathParam("customerId") long customerId) {
        return customerService.getCustomer(customerId);
    }

}
