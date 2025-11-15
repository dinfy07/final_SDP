package Pizza;

import Decorator.PizzaDecorator;

public class PepperoniPizza implements Pizza {
    public String pizza = "Pepperoni";
    public String prepare = "Preparing dough, tomato sauce, mozzarella, pepperoni for";
    public int price = 500;
    public PizzaDecorator pizzaDecorator;
    public int temperature = 400;

    public PepperoniPizza(PizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
        this.price = this.price + pizzaDecorator.getPrice();
        this.pizza = pizzaDecorator.getPizza() + this.pizza;
    }

    public PepperoniPizza() {
    }

    public String preparing(){
        return this.prepare + this.pizza;
    }

    public String cookPizza() {
        return "Bake at" + this.temperature;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}