package edu.fscj.cen3024c.m4pizzarestaurant.controller;

import edu.fscj.cen3024c.m4pizzarestaurant.entity.Pizza;
import edu.fscj.cen3024c.m4pizzarestaurant.service.PizzaService;
import edu.fscj.cen3024c.m4pizzarestaurant.dto.PizzaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
    private final PizzaService pizzaService;
    
    // insert your code here
}
