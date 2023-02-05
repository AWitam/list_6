package builder_pattern.director;

import builder_pattern.builder.Builder;
import builder_pattern.components.*;

public class Director {

    public void constructToyShop(Builder builder) {
        builder.buildName("Toy Shop");
        builder.buildAddress(new Address("Toy Street", "USA", "Michigan", "23-456"));
        builder.buildOwner(new Person("John", "Doe", Type.OWNER));

        builder.buildEmployee(new Employee("Kate", "Harris", Type.EMPLOYEE, "shop assistant", 45000));
        builder.buildEmployee(new Employee("James", "Black", Type.EMPLOYEE, "cashier", 45000));
        builder.buildEmployee(new Employee("Anne", "Jones", Type.EMPLOYEE, "manager", 50000));

        builder.buildProduct(new Product("Lego Truck", 100, "bricks", "Plastic Lego truck"));
        builder.buildProduct(new Product("Barbie", 30, "dolls", "Blonde Barbie doll"));
        builder.buildProduct(new Product("Puzzle", 20, "puzzle", "Puzzle with 1000 pieces"));
    }

    public void constructBookShop(Builder builder) {
        builder.buildName("Book Shop");
        builder.buildAddress(new Address("Book Street", "USA", "New York", "23-456"));
        builder.buildOwner(new Person("Mary", "Sparrow", Type.OWNER));

        builder.buildEmployee(new Employee("Kate", "Harris", Type.EMPLOYEE, "shop assistant", 45000));
        builder.buildEmployee(new Employee("James", "Black", Type.EMPLOYEE, "cashier", 45000));
        builder.buildEmployee(new Employee("Anne", "Jones", Type.EMPLOYEE, "manager", 50000));

        builder.buildProduct(new Product("Harry Potter", 100, "books", "Harry Potter and the Philosopher's Stone"));
        builder.buildProduct(new Product("Lord of the Rings", 30, "books", "The Fellowship of the Ring"));
        builder.buildProduct(new Product("The Hobbit", 20, "books", "The Hobbit"));
    }


    public void constructClothesShop(Builder builder) {
        builder.buildName("Clothes Shop");
        builder.buildAddress(new Address("Clothes Street", "USA", "New York", "23-456"));
        builder.buildOwner(new Person("Jane", "Jones", Type.OWNER));

        builder.buildEmployee(new Employee("Kate", "Harris", Type.EMPLOYEE, "shop assistant", 45000));
        builder.buildEmployee(new Employee("James", "Black", Type.EMPLOYEE, "cashier", 45000));
        builder.buildEmployee(new Employee("Anne", "Jones", Type.EMPLOYEE, "manager", 50000));

        builder.buildProduct(new Product("T-shirt", 100, "clothes", "T-shirt with a print"));
        builder.buildProduct(new Product("Jeans", 30, "clothes", "Jeans with a print"));
        builder.buildProduct(new Product("Shoes", 20, "clothes", "Shoes with a print"));
    }


}
