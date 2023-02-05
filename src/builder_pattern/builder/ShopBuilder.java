package builder_pattern.builder;

import builder_pattern.components.Address;
import builder_pattern.components.Person;
import builder_pattern.components.Product;
import builder_pattern.shop.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopBuilder implements Builder {
    private String name;
    private Address address;
    private Person owner;

    private List<Person> employees = new ArrayList<Person>();
    private List<Product> products = new ArrayList<Product>();



    public Shop getShop() {
        return new Shop(name, address, owner, employees, products);
    }

    @Override
    public void buildName(String name) {
        this.name = name;
    }


    @Override
    public void buildAddress(Address address) {
        this.address = address;
    }

    @Override
    public void buildOwner(Person owner) {
        this.owner = owner;
    }


    @Override
    public void buildEmployee(Person employee) {
        this.employees.add(employee);
    }

    @Override
    public void buildProduct(Product product) {
        this.products.add(product);
    }
}
