package Decorator;


import Pizza.Pizza;
import Restaurant.Restaurant;

public class PineappleDecorator extends PizzaDecorator {
    public int price = 400;
    String pizza = "pineapple";

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getPizza() {
        return pizza;
    }

}