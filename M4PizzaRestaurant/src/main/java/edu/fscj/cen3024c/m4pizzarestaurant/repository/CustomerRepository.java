package edu.fscj.cen3024c.m4pizzarestaurant.repository;

import edu.fscj.cen3024c.m4pizzarestaurant.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // find by last name
    List<Customer> findByLastName(String lastName);
    // find by user id
    Optional<Customer> findByUserId(String userId);
}