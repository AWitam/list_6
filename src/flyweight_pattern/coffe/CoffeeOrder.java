package flyweight_pattern.coffe;

public class CoffeeOrder {
    private Coffee coffee;
    private int tableNumber;

    public CoffeeOrder(Coffee coffee, int tableNumber) {
        this.coffee = coffee;
        this.tableNumber = tableNumber;
    }

    public void serveCoffee() {
        coffee.prepareCoffee();
        System.out.println("Serving coffee to table " + tableNumber);
    }
}
