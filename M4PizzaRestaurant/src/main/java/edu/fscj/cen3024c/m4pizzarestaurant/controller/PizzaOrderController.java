package edu.fscj.cen3024c.m4pizzarestaurant.controller;

import edu.fscj.cen3024c.m4pizzarestaurant.entity.PizzaOrder;
import edu.fscj.cen3024c.m4pizzarestaurant.service.PizzaOrderService;
import edu.fscj.cen3024c.m4pizzarestaurant.dto.PizzaOrderDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pizzaorders")
public class PizzaOrderController {
    private final PizzaOrderService pizzaOrderService;
    
    // insert your code here
}
