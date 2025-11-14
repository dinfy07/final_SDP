package Pizza;

import Decorator.PizzaDecorator;

public class PepperoniPizza implements Pizza {
    public String pizza = "Pepperoni";
    public int price = 500;

    public PepperoniPizza(PizzaDecorator pizzaDecorator) {
//        pizzaDecorator
    }

    public PepperoniPizza(){

    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void prepare() {
        System.out.println("Preparing dough, tomato sauce, mozzarella, pepperoni for " + pizza);
    }
    public void bake() {
        System.out.println("Baking at 400°C until edges are crisp.");
    }
}