package com.kursplaner.backend.resource.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository CustomerRepository;

    public List<Customer> getAllCustomers() {
        return CustomerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(String id) {
        return CustomerRepository.findById(id);
    }

    public Customer saveCustomer(Customer Customer) {
        return CustomerRepository.save(Customer);
    }

    public List<Customer> saveAllCustomers(List<Customer> Customers) {
        return CustomerRepository.saveAll(Customers);
    }

    public void deleteCustomer(String id) {
        CustomerRepository.deleteById(id);
    }

    public void deleteAllCustomers() {
        CustomerRepository.deleteAll();
    }

    public Customer getCustomerByEmail(String email) {
        return  new Customer();
    }


    public long getCustomerCount() {
        return CustomerRepository.count();
    }

    public boolean existsById(String id) {
        return CustomerRepository.existsById(id);
    }
}