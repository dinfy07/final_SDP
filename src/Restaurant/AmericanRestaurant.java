package Restaurant;

import Pizza.Pizza;

public class AmericanRestaurant extends Restaurant {
    public int price = 100;
    private Pizza pizza;

    public AmericanRestaurant(Pizza pizza) {
        this.pizza = pizza;
        this.price = this.price + pizza.getPrice();
    }

    public void cookPizza(){
        System.out.println(this.pizza.preparing());
        System.out.println(this.pizza.cookPizza());
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    void stylePrep() {
        System.out.println("American style: extra cheese, larger 14 size.");
    }

    void serve() {
        System.out.println("Serving with ranch dip and paper box.");
    }
}