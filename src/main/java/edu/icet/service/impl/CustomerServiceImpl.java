package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;
    final ModelMapper mapper;

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getCustomer() {
        List<Customer> customerList = new ArrayList<>();
        repository.findAll().forEach(customer -> customerList.add(mapper.map(customer, Customer.class)));
        return customerList;
    }

    @Override
    public void deleteById(Integer customerId) {
        repository.deleteById(customerId);
    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        repository.findByName(name).forEach(entity -> customerList.add(mapper.map(entity, Customer.class)));
        return customerList;
    }

    @Override
    public List<Customer> searchByContactNumber(String contactNumber) {
        List<Customer> customerList = new ArrayList<>();
        repository.findByContactNumber(contactNumber).forEach(entity -> customerList.add(mapper.map(entity, Customer.class)));
        return customerList;
    }

    @Override
    public List<Customer> searchByAddress(String address) {
        List<Customer> customerList = new ArrayList<>();
        repository.findByAddress(address).forEach(entity -> customerList.add(mapper.map(entity, Customer.class)));
        return customerList;
    }
}
