package Pizza;

import Decorator.PizzaDecorator;

public interface Pizza {
    public String pizza = "default";
    public int price = 0;

    void setPrice(int price);
    int getPrice();
    String preparing();
    String cookPizza();
}



