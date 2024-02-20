package edu.fscj.cen3024c.m4pizzarestaurant.controller;

import edu.fscj.cen3024c.m4pizzarestaurant.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

import edu.fscj.cen3024c.m4pizzarestaurant.entity.Customer;
import edu.fscj.cen3024c.m4pizzarestaurant.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<CustomerDTO> customerDTOs = customerService.getAllCustomerDTOs();
        return ResponseEntity.ok(customerDTOs);
    }

    @GetMapping("/{userid}")
    public ResponseEntity<CustomerDTO> getCustomerByUserId(@PathVariable(value = "userid") String userId) {
        CustomerDTO customerDTO = customerService.getCustomerDTOByUserId(userId);
        return ResponseEntity.ok().body(customerDTO);
    }
}
