package service;



import model.Customer;

import java.util.List;

public interface ICustomerServiceORM {
    List<Customer> findAll();

    Customer findById(Integer id);

    void update(Customer customer);

    void save(Customer customer);

    void remove(int id);

    List<Customer> findByName(String name);
}
