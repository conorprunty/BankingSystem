/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupa.bankingsystem;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author conorprunty
 */
@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    CustomerService customerService = new CustomerService();

    @GET
    public List<Customer> getCustomer() {
        return customerService.getAllCustomers();
    }

    @POST
    public Customer addCustomer(Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PUT
    @Path("/{customerName}")
    public Customer updateCustomer(@PathParam("customerName") String customerName, Customer customer) {
        customer.setName(customerName);
        return customerService.updateCustomer(customer);
    }

    @DELETE
    @Path("/{customerName}")
    public void deleteCustomer(@PathParam("customerName") String customerName) {
        customerService.removeCustomer(customerName);
    }

    @GET
    @Path("/{customerName}")
    public Customer getCustomer(@PathParam("customerName") String customerName) {
        return customerService.getCustomer(customerName);
    }

}
