package Decorator;

public class PizzaDecorator   {
    private int price = 0;
    private String pizza = "default";

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getPrice() {
        return price;
    }

    public String getPizza() {
        return pizza;
    }
}
