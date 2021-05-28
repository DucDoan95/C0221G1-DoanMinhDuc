package model.reponsitory;

import model.bean.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
        static Map<String, Customer> customers;

        static {
            customers = new HashMap<>();
            customers.put("1", new Customer("1", "John", "john@codegym.vn", "Hanoi"));
            customers.put("2", new Customer("2", "Bill", "bill@codegym.vn", "Danang"));
            customers.put("3", new Customer("3", "Alex", "alex@codegym.vn", "Saigon"));
            customers.put("4", new Customer("4", "Adam", "adam@codegym.vn", "Beijin"));
            customers.put("5", new Customer("5", "Sophia", "sophia@codegym.vn", "Miami"));
            customers.put("6", new Customer("6", "Rose", "rose@codegym.vn", "Newyork"));
        }

        public List<Customer> findAll() {
            return new ArrayList<>(customers.values());
        }


        public void add(Customer customer) {
            customers.put(customer.getId(), customer);

        }


        public Customer findById(String id) {
            return customers.get(id);
        }


        public void update(String id, Customer customer) {
            customers.put(id, customer);
        }


        public void remove(String id) {
            customers.remove(id);
        }


}
