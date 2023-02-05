package flyweight_pattern.coffe;


public class Coffee {
    private CoffeeType type;
    private double price;


    public Coffee(CoffeeType type) {
        this.type = type;
        this.setPrice();
    }

    public void setPrice() {
        switch (type) {
            case ESPRESSO:
                this.price = 1.99;
                break;
            case CAPPUCCINO:
                this.price = 2.99;
                break;
            case LATTE:
                this.price = 3.99;
                break;
            case AMERICANO:
                this.price = 4.99;
                break;
            case MOCHA:
                this.price = 5.99;
                break;
        }
    }

    public void prepareCoffee() {
        System.out.println("Preparing " + type + " coffee");
    }

}
