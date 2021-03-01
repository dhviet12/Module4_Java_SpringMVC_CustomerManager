package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import service.ICustomerService;

import java.util.List;

@Controller
public class CustomerController {
    private ICustomerService customerService = new CustomerService();

    @GetMapping("/customers")
    public ModelAndView showList(){
        ModelAndView modelAndView= new ModelAndView("list");
        List<Customer> list = customerService.findAll();
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
