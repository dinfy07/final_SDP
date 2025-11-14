package Restaurant;

import Pizza.Pizza;

public class ItalianRestaurant extends Restaurant {
    public int price = 200;
    private Pizza pizza;

    public void addPizza(Pizza pizza) {
        this.price = this.price + pizza.getPrice();
//        System.out.println(pizza.getPrice());
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    void stylePrep() {
        System.out.println("Italian style: thin crust, drizzle.");
    }

    void serve() {
        System.out.println("Serving on wooden board with oregano.");
    }
}