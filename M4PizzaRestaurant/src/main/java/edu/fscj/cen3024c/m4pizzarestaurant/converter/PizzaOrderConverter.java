package edu.fscj.cen3024c.m4pizzarestaurant.converter;

import edu.fscj.cen3024c.m4pizzarestaurant.dto.PizzaOrderDTO;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.Customer;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.Pizza;
import edu.fscj.cen3024c.m4pizzarestaurant.entity.PizzaOrder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PizzaOrderConverter {
    public PizzaOrderDTO convertToDTO(PizzaOrder PizzaOrder) {
        PizzaOrderDTO dto = new PizzaOrderDTO();

        // insert your code here
        return dto;
    }

    public PizzaOrder converttoPizzaOrder(PizzaOrderDTO pizzaOrderDTO) {
        PizzaOrder pizzaOrder = new PizzaOrder();

        // insert your code here
        return pizzaOrder;
    }
}
