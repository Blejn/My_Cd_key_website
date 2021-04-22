package pl.projekt.customers;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.projekt.customers.Customer;
import pl.projekt.customers.CustomerDao;

import javax.persistence.Column;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  <form:radiobuttons items="${languages}" path="language"/>
@Controller
@RequestMapping
public class CustomerController {
    private final CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createBook() {
        Customer customer = new Customer("Customer");
        customerDao.saveCustomer(customer);
        return "utworzono customera o id " + customer.getId();
    }


    @GetMapping("/order_page")
    public String Order_Page(Model model) {
        model.addAttribute("customers", new Customer());
        return "order_page";
    }

    @PostMapping("/order_page")
    @ResponseBody
    public String postForm(@ModelAttribute("customers") Customer customer) {
        customerDao.saveCustomer(customer);
        return "Odebrano klienta: " + customer.getFirstName() + " " + customer.getLastName();
    }


    @ModelAttribute("languages")
 public List<String> languages(){
        return List.of("java","javascript","go")
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
