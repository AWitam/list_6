package flyweight_pattern.coffe;

import java.util.HashMap;
import java.util.Map;

public class CoffeeOrderFactory {
    private static final Map<CoffeeType, Coffee> coffeeMap = new HashMap<>();

    public static Coffee getCoffee(CoffeeType type) {
        Coffee coffee = coffeeMap.get(type);
        if (coffee == null) {
            coffee = new Coffee(type);
            coffeeMap.put(type, coffee);
        }
        return coffee;
    }
}
