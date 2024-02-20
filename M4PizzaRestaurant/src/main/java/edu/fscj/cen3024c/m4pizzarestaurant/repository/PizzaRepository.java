package edu.fscj.cen3024c.m4pizzarestaurant.repository;

import edu.fscj.cen3024c.m4pizzarestaurant.entity.Pizza;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
    // find by pizza type
    List<Pizza> findByPizzaType(String pizzaType);
    // find by pizza size
    List<Pizza> findByPizzaSize(int size);
    // find by pizza crust type
    List<Pizza> findByCrustType(String crustType);
}