package Restaurant;

import Pizza.Pizza;

public class ItalianRestaurant extends Restaurant {
    public int price = 200;
    public Pizza pizza;

    public ItalianRestaurant(Pizza pizza) {
        this.pizza = pizza;
        this.price = this.price + pizza.getPrice();

    }

    public void cookPizza(){
        System.out.println(this.pizza.preparing());
        System.out.println(this.pizza.cookPizza());
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