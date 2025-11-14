package Builder;

import Decorator.PizzaDecorator;
import Facade.FacadePizza;
import Payment.KaspiAlaqan;
import Pizza.Pizza;
import Restaurant.Restaurant;

public class Order {
    private String firstName;
    private Restaurant restaurant;
    private Pizza pizza;
    private PizzaDecorator pizzaDecorator;
    private KaspiAlaqan paymentType;
    private FacadePizza facadePizza;

    private Order(Builder builder){
        System.out.println("Your order has been created");
        this.firstName = builder.firstName;
        this.restaurant = builder.restaurant;
        this.pizzaDecorator = builder.pizzaDecorator;
        this.pizza = builder.pizza;
        this.paymentType = builder.paymentType;
        this.facadePizza = new FacadePizza(this.restaurant, this.pizza, this.pizzaDecorator);
        this.restaurant = facadePizza.countPizza();
        System.out.println("Your order cost:" + this.restaurant.getPrice());
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setPaymentType(KaspiAlaqan paymentType) {
        this.paymentType = paymentType;
    }

    public void payOrder(){
        paymentType.pay();
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setPizzaDecorator(PizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    public void cookPizza(){
        this.facadePizza.cookPizza();
        System.out.println(this.firstName + "your order has been created");
    }
    public static class Builder {
        private String firstName;
        private Restaurant restaurant;
        private Pizza pizza;
        private PizzaDecorator pizzaDecorator;
        private KaspiAlaqan paymentType;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder pizza(Pizza pizza){
            this.pizza = pizza;
            return this;
        }

        public Builder restaurant(Restaurant restaurant){
            this.restaurant = restaurant;
            return this;
        }

        public Builder pizzaDecorator(PizzaDecorator decorator){
            if (decorator != null){
                this.pizzaDecorator = decorator;
                return this;
            }
            return this;
        }


        public Builder paymentType(KaspiAlaqan paymentType){
            this.paymentType = paymentType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }


}
