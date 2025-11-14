package Restaurant;

import Pizza.Pizza;

public class AmericanRestaurant extends Restaurant {
    public int price = 100;

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
        this.price = this.price + pizza.getPrice();
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