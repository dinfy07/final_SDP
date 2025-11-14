package Facade;

import Decorator.PizzaDecorator;
import Pizza.Pizza;
import Restaurant.Restaurant;

public class FacadePizza {
    Restaurant restaurant;
    Pizza pizza;
    PizzaDecorator pizzaDecorator;

    public FacadePizza(Restaurant restaurant, Pizza pizza, PizzaDecorator pizzaDecorator) {
        if(pizzaDecorator != null) {
            this.restaurant = restaurant;
            this.pizza = pizza;
            this.pizzaDecorator = pizzaDecorator;
        } else {
            this.restaurant = restaurant;
            this.pizza = pizza;
        }
    }

    public Restaurant countPizza() {
        if (this.pizzaDecorator != null) {
            this.pizza.addDecorator(this.pizzaDecorator);
        }
        this.restaurant.addPizza(this.pizza);
        return this.restaurant;
    }

    public void cookPizza() {
        System.out.println(this.pizza.preparing());
        System.out.println(this.pizza.cookPizza());
    }

}
