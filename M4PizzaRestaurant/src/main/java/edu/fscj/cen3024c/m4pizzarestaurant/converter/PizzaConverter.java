package edu.fscj.cen3024c.m4pizzarestaurant.converter;

import edu.fscj.cen3024c.m4pizzarestaurant.dto.PizzaDTO;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.Pizza;
import org.springframework.stereotype.Component;

@Component
public class PizzaConverter {
    public PizzaDTO convertToDTO(Pizza pizza) {
        PizzaDTO dto = new PizzaDTO();
        // insert your code here
        return dto;
    }

    public Pizza converttoPizza(PizzaDTO pizzaDTO) {
        Pizza pizza = new Pizza();
        // insert your code here
        return pizza;
    }
}
