package pl.projekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/main_page")
    public String Main_page() {
        return "main_page";
    }

    @GetMapping("/description")
    public String Description() {
        return "desription";
    }



    @GetMapping("/contact_page")
    public String Contact_Page() {
        return "contact_page";
    }

    @GetMapping("/paymentmethod_page")
    public String Payment_Page() {
        return "paymentmethod_page";
    }


}
