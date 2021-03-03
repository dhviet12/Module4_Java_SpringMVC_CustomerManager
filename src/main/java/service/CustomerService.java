package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final Map<Integer, Customer> customerList = new HashMap<>();

    static {
        customerList.put(1,new Customer(1, "Viet", "viet@gmail.com", "Ha Noi"));
        customerList.put(2,new Customer(2, "Duy", "duy@gmail.com", "Ho Chi Minh"));
        customerList.put(3,new Customer(3, "Nam", "nam@gmail.com", "Da Nang"));
        customerList.put(4,new Customer(4, "Manh", "manh@gmail.com", "Ha Noi"));
        customerList.put(5,new Customer(5, "Huy", "huy@gmail.com", "Bac Ninh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList.values());
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void createCustomer(Customer customer) {
        customerList.put(customer.getId(),customer);
    }

    @Override
    public Customer editCustomer(int id, Customer customer) {
        return customerList.put(id,customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerList.remove(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : customerList.values()) {
            if (c.getName().equals(name)) {
                result.add(c);
            }
        }
        return result;
    }

}
