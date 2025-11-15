package Restaurant;

import Pizza.Pizza;

public abstract class Restaurant {
    public int price;


    public void addPizza(Pizza pizza) {
        this.price = this.price + pizza.getPrice();
    }

    public void cookPizza(){

    }

    public int getPrice() {
        return this.price;
    }
    abstract void stylePrep();
    abstract void serve();
}