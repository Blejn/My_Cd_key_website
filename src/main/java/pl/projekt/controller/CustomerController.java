package pl.projekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.projekt.customers.Customer;
import pl.projekt.customers.CustomerDao;

import javax.persistence.Column;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private  final CustomerDao customerDao;
    public  CustomerController(CustomerDao customerDao){
        this.customerDao=customerDao;
    }
    @GetMapping("/create")
    @ResponseBody
    public String createBook(){
        Customer customer= new Customer("Customer");
        customerDao.saveCustomer(customer);
        return "utworzono customera o id "+ customer.getId();
    }
}
