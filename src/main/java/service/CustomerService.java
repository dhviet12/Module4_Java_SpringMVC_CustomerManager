package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static final List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(0, "Viet", "viet@gmail.com", "Ha Noi"));
        customerList.add(new Customer(1, "Duy", "duy@gmail.com", "Ho Chi Minh"));
        customerList.add(new Customer(2, "Nam", "nam@gmail.com", "Da Nang"));
        customerList.add(new Customer(3, "Manh", "manh@gmail.com", "Ha Noi"));
        customerList.add(new Customer(4, "Huy", "huy@gmail.com", "Bac Ninh"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void createCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public Customer editCustomer(int id, Customer customer) {
        return customerList.set(id, customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerList.remove(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> result = new ArrayList<>();
        for (Customer c: customerList) {
            if (c.getName().equals(name)){
                result.add(c);
            }
        }
        return result;
    }
}
