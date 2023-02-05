package flyweight_pattern;

import flyweight_pattern.coffe.CoffeeType;
import flyweight_pattern.coffeehouse.Coffeehouse;

import static java.lang.Math.random;

public class FlyweightPatternDemo {
    static int cappucinoOrders = 300;
    static int latteOrders = 200;
    static int espressoOrders = 100;
    static int mochaOrders = 150;
    static int americanoOrders = 50;
    static int tablesCount = 30;

    public static void main(String[] args) {
        Coffeehouse coffeehouse = new Coffeehouse();

        for (int i = 0; i < cappucinoOrders; i++) {
            coffeehouse.serveOrder(CoffeeType.CAPPUCCINO, (int) (random() * tablesCount + 1));
        }

        for (int i = 0; i < latteOrders; i++) {
            coffeehouse.serveOrder(CoffeeType.LATTE, (int) (random() * tablesCount + 1));
        }

        for (int i = 0; i < espressoOrders; i++) {
            coffeehouse.serveOrder(CoffeeType.ESPRESSO, (int) (random() * tablesCount + 1));
        }

        for (int i = 0; i < mochaOrders; i++) {
            coffeehouse.serveOrder(CoffeeType.MOCHA, (int) (random() * tablesCount + 1));
        }

        for (int i = 0; i < americanoOrders; i++) {
            coffeehouse.serveOrder(CoffeeType.AMERICANO, (int) (random() * tablesCount + 1));
        }

        int total = cappucinoOrders + latteOrders + espressoOrders + mochaOrders + americanoOrders;
        int coffeeTypes = CoffeeType.values().length;
        int coffeeSize = 2000;  // bites
        int coffeeOrderSize = 1000; // bites


        System.out.println( total + " coffees to serve");
        System.out.println("---------------------");
        System.out.println("Memory usage:\n");
        System.out.println("  Coffee size (" + coffeeSize + ") * " + total);
        System.out.println("+ CoffeeOrder size (" + coffeeOrderSize + ") * " + coffeeTypes + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((total * coffeeSize + coffeeTypes * coffeeOrderSize) / 1024 / 1024) +
                "MB (instead of " + ((total * (coffeeSize + coffeeOrderSize)) / 1024 / 1024) + "MB)");
    }
}
