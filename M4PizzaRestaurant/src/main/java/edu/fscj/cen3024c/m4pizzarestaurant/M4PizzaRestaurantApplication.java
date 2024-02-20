package edu.fscj.cen3024c.m4pizzarestaurant;

import edu.fscj.cen3024c.m4pizzarestaurant.repository.CustomerRepository;
import edu.fscj.cen3024c.m4pizzarestaurant.repository.PizzaRepository;
import edu.fscj.cen3024c.m4pizzarestaurant.repository.PizzaOrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class M4PizzaRestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(M4PizzaRestaurantApplication.class, args);
    }

    @Bean
    public CommandLineRunner testDatabaseRepositories(
                CustomerRepository customerRepo,
                PizzaRepository pizzaRepo,
                PizzaOrderRepository pizzaOrderRepo) {
        return args -> {
            System.out.println("FINDALLCUSTOMERS");
            customerRepo.findAll().forEach(customer ->
                    System.out.println(customer.toString()));
            System.out.println("FINDBYLASTNAME");
            customerRepo.findByLastName("Smith").forEach(customer ->
                    System.out.println(customer.toString()));
            System.out.println("FINDBYUSERID");
            System.out.println(customerRepo.findByUserId("sallybrown"));

            System.out.println("FINDALLPIZZAS");
            pizzaRepo.findAll().forEach(pizza ->
                    System.out.println(pizza.toString()));
            System.out.println("FINDBYPIZZATYPE");
            pizzaRepo.findByPizzaType("pepperoni").forEach(pizza ->
                    System.out.println(pizza.toString()));

            System.out.println("FINDALLPIZZAORDERS");
            pizzaOrderRepo.findAll().forEach(order ->
                    System.out.println(order.toString()));
            System.out.println("FINDBYPIZZAPIZZATYPE");
            pizzaOrderRepo.findByPizzaPizzaType("pepperoni").
                    forEach(pizza -> System.out.println(pizza.toString()));
            System.out.println("FINDBYPIZZAPIZZATYPEIGNORECASE");
            pizzaOrderRepo.findByPizzaPizzaTypeIgnoreCase("PEPPERONI")
                    .forEach(pizza -> System.out.println(pizza.toString()));

            System.out.println("FINDBYPIZZAPIZZASIZE");
            // add your method call here
            System.out.println("FINDBYPIZZAPIZZACRUSTTYPE");
            // add your method call here
            System.out.println("FINDBYCUSTOMERCUSTOMERLASTNAME");
            // add your method call here

            System.out.println("DONE");
        };
    }
}
