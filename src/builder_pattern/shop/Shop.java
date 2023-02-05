package builder_pattern.shop;

import builder_pattern.components.Address;
import builder_pattern.components.Person;
import builder_pattern.components.Product;

import java.util.List;

public class Shop {
    // name, address, listof employees, list of products, owner
    private String name;
    private Address address;
    private Person owner;
    private List<Person> employees;
    private List<Product> products;

    public Shop(String name, Address address, Person owner, List<Person> employees, List<Product> products) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.employees = employees;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Person getOwner() {
        return owner;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return String.format("Shop: %s\nAddress: %s\nOwner: %s\nEmployees: %s\nProducts: %s\n\n",  name, address, owner, employees.toString(), products.toString());
    }
}
