package Pizza;

import Decorator.PizzaDecorator;

public interface Pizza {
    public String pizza = "default";
    public int price = 0;

    void setPrice(int price);
    int getPrice();
    void addDecorator(PizzaDecorator pizzaDecorator);
    String preparing();
    String cookPizza();
}



