package Facade;

import Decorator.CheeseDecorator;
import Decorator.PineappleDecorator;
import Pizza.MargheritaPizza;
import Pizza.PepperoniPizza;
import Restaurant.AmericanRestaurant;
import Restaurant.ItalianRestaurant;
import Restaurant.Restaurant;

public class FacadePizza {
    int restaurant;
    int pizza;
    int pizzaDecorator;
    Restaurant finalPizza;

    public FacadePizza(int restaurant, int pizza, int pizzaDecorator) {
        if(pizzaDecorator != 0) {
            this.restaurant = restaurant;
            this.pizza = pizza;
            this.pizzaDecorator = pizzaDecorator;
        } else {
            this.restaurant = restaurant;
            this.pizza = pizza;
        }
    }

    public Restaurant countPizza() {
        if (this.pizzaDecorator == 0 && this.restaurant == 1 & this.pizza == 1) {
            this.finalPizza = new AmericanRestaurant(new PepperoniPizza());
        } else if (this.pizzaDecorator == 0 && this.restaurant == 1 & this.pizza == 2) {
            this.finalPizza = new AmericanRestaurant(new MargheritaPizza());
        } else if (this.pizzaDecorator == 0 && this.restaurant == 2 & this.pizza == 1) {
            this.finalPizza = new ItalianRestaurant(new MargheritaPizza());
        } else if (this.pizzaDecorator == 0 && this.restaurant == 2 & this.pizza == 2) {
            this.finalPizza = new ItalianRestaurant(new PepperoniPizza());
        } else if (this.pizzaDecorator == 1 && this.restaurant == 1 & this.pizza == 1) {
            this.finalPizza = new AmericanRestaurant(new PepperoniPizza(new CheeseDecorator()));
        } else if (this.pizzaDecorator == 1 && this.restaurant == 1 & this.pizza == 2) {
            this.finalPizza = new AmericanRestaurant(new MargheritaPizza(new CheeseDecorator()));
        } else if (this.pizzaDecorator == 2 && this.restaurant == 2 & this.pizza == 1) {
            this.finalPizza = new ItalianRestaurant(new MargheritaPizza(new PineappleDecorator()));
        } else if (this.pizzaDecorator == 2 && this.restaurant == 2 & this.pizza == 2) {
            this.finalPizza = new ItalianRestaurant(new PepperoniPizza(new PineappleDecorator()));
        }
        return  finalPizza;
    }

    public void cookPizza() {
        this.finalPizza.cookPizza();
    }

    public int getPrice() {
        return this.finalPizza.getPrice();
    }
}
