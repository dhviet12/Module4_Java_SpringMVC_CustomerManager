package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import service.ICustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();

    @GetMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> list = customerService.findAll();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView(("create"));
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createCustomer(@RequestParam int id, String name, String email, String address) {
        ModelAndView modelAndView = new ModelAndView("list");
        Customer customer = new Customer(id, name, email, address);
        customerService.createCustomer(customer);
        List<Customer> list = customerService.findAll();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/edit/id={id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("edit/id={id}")
    public ModelAndView editCustomer(@RequestParam int edit_id, String edit_name, String edit_email, String edit_address, @PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Customer customer = new Customer(edit_id, edit_name, edit_email, edit_address);
        customerService.editCustomer(id,customer);
        return modelAndView;

    }
}
