package pl.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.projekt.customers.Customer;
import pl.projekt.service.CustomerService;
import pl.projekt.dto.CustomerDto;


import javax.persistence.Access;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//  <form:radiobuttons items="${languages}" path="language"/>
@Controller
@RequestMapping("order_page")
public class CustomerController {
    private final CustomerService customerService;

    private final Validator validator;

    public CustomerController(CustomerService customerService, Validator validator) {
        this.customerService = customerService;
        this.validator = validator;
    }


    @GetMapping("/order_page")
    public ModelAndView Order_Page() {
        return new ModelAndView("order_page", Map.of(
                "customer", new CustomerDto()
        ));
        // model.addAttribute("customers", new Customer());
        //return "order_page";
    }

    @PostMapping("/order_page")

    public String postForm(@ModelAttribute("customer")@Valid CustomerDto customer, BindingResult bindingResult) {
       if(bindingResult.hasErrors()){
           return "order_page";
       }
            customerService.add(customer);
           return  "redirect:/order_page/order_page";
           // return customerService.findAll().toString();


    }


    @ModelAttribute("voivodeships")
    public List<String> voivodeships() {
        return List.of("śląskie",
                "dolnośląskie",
                "wielkopolskie",
                "łódzkie",
                "opolskie", "podlaskie",
                "podkarpackie",
                "warmińsko-mazurskie",
                "lubelskie",
                "pomorskie",
                "lubuskie",
                "świętokrzyskie",
                "mazowieckie",
                "kujawsko-pomorskie",
                "zachodniopomorskie",
                "małopolskie")
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
