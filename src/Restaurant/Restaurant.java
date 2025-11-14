package Restaurant;

import Pizza.Pizza;

public abstract class Restaurant {
    private Pizza pizza;
    public int price;

    Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getPrice() {
        return this.price;
    }
    abstract void stylePrep();
    abstract void serve();
}