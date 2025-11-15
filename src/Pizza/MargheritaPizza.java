package Pizza;

import Decorator.PizzaDecorator;

public class MargheritaPizza implements Pizza {
    public String pizza = "Margherita";
    public String prepare = "Preparing dough, tomato sauce, mozzarella, basil";
    public int price = 400;
    public PizzaDecorator pizzaDecorator;
    public int temperature = 450;


    public MargheritaPizza(PizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
        this.price = this.price + pizzaDecorator.getPrice();
        this.pizza = pizzaDecorator.getPizza() + this.pizza;
    }
    public MargheritaPizza() {
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