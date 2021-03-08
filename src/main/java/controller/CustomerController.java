package controller;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ICustomerService;
import service.ICustomerServiceORM;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
   @Autowired
   private ICustomerServiceORM customerServiceORM;

    @GetMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> list = customerServiceORM.findAll();
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("cus", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createCustomer(@ModelAttribute Customer customer) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customerServiceORM.save(customer);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Customer customer = customerServiceORM.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView editCustomer(@ModelAttribute Customer customer, @PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customer.setId(id);
        customerServiceORM.save(customer);
        return modelAndView;
    }
//
    @GetMapping("delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customerServiceORM.remove(id);
        return modelAndView;
    }
//    @PostMapping("")
//    public ModelAndView searchByName(@RequestParam String search){
//        ModelAndView modelAndView = new ModelAndView("list");
//        List<Customer> result = customerService.findByName(search);
//        modelAndView.addObject("list",result);
//        return  modelAndView;
//    }
}
