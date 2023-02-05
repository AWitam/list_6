package flyweight_pattern.coffeehouse;

import flyweight_pattern.coffe.Coffee;
import flyweight_pattern.coffe.CoffeeOrder;
import flyweight_pattern.coffe.CoffeeOrderFactory;
import flyweight_pattern.coffe.CoffeeType;

import java.util.ArrayList;
import java.util.List;

public class Coffeehouse {
    private List<CoffeeOrder> orders = new ArrayList<>();

    public void serveOrder(CoffeeType coffeeType, int tableNumber) {
        Coffee coffee = CoffeeOrderFactory.getCoffee(coffeeType);
        CoffeeOrder coffeeOrder = new CoffeeOrder(coffee, tableNumber);
        orders.add(coffeeOrder);
    }
}
