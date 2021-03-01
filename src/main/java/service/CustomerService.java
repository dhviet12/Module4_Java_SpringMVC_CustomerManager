package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Viet","viet@gmail.com","Ha Noi"));
        customerList.add(new Customer(2,"Duy","duy@gmail.com","Ho Chi Minh"));
        customerList.add(new Customer(3,"Nam","nam@gmail.com","Da Nang"));
        customerList.add(new Customer(4,"Manh","manh@gmail.com","Ha Noi"));
        customerList.add(new Customer(5,"Huy","huy@gmail.com","Bac Ninh"));
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }
}
