package Restaurant;

import Pizza.Pizza;

public class ItalianRestaurant extends Restaurant {
    public int price = 200;

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
        this.price = this.price + pizza.getPrice();
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