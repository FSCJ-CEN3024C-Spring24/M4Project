package edu.fscj.cen3024c.m4pizzarestaurant.service;

import edu.fscj.cen3024c.m4pizzarestaurant.converter.CustomerConverter;
import edu.fscj.cen3024c.m4pizzarestaurant.dto.CustomerDTO;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.Customer;
import edu.fscj.cen3024c.m4pizzarestaurant.exceptions.ResourceNotFoundException;
import edu.fscj.cen3024c.m4pizzarestaurant.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerConverter customerConverter;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, CustomerConverter customerConverter) {
        this.customerRepository = customerRepository;
        this.customerConverter = customerConverter;
    }

    public List<CustomerDTO> getAllCustomerDTOs() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .map(customerConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    public CustomerDTO getCustomerDTOByUserId(String userId) {
        Customer customer = customerRepository.findByUserId(userId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Customer not found with userId: " + userId));
        return customerConverter.convertToDTO(customer);
    }
}