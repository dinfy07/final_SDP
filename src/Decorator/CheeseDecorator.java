package Decorator;

public class CheeseDecorator extends PizzaDecorator {
    public int price = 300;
    String pizza = "extra cheese";

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
