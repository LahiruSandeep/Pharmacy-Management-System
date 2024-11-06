package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);

    List<Customer> getCustomer();

    void deleteById(Integer customerId);

    List<Customer> searchByName(String name);

    List<Customer> searchByContactNumber(String contactNumber);

    List<Customer> searchByAddress(String address);
}
