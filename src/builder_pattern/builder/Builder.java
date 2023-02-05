package builder_pattern.builder;


import builder_pattern.components.Address;
import builder_pattern.components.Person;
import builder_pattern.components.Product;

public interface Builder {
    // shop builder
    void buildName(String name);
    void buildAddress(Address address);
    void buildOwner(Person owner);
    void buildEmployee(Person employee);
    void buildProduct(Product product);
}
