package edu.fscj.cen3024c.m4pizzarestaurant.repository;

import edu.fscj.cen3024c.m4pizzarestaurant.entity.Customer;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Integer> {
    // find by pizza type
    List<PizzaOrder> findByPizzaPizzaType(String pizzaType);
    // find by pizza type (ignore case)
    List<PizzaOrder> findByPizzaPizzaTypeIgnoreCase(String pizzaType);
    // find by pizza size
    List<PizzaOrder> findByPizzaPizzaSize(int size);
    // find by crust type
    List<PizzaOrder> findByPizzaCrustType(String crustType);
    // find by customer last name
    List<PizzaOrder> findByCustomerLastName(String lastName);
}