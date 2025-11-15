package Builder;

import Decorator.PizzaDecorator;
import Facade.FacadePizza;
import Payment.KaspiAlaqan;
import Pizza.Pizza;
import Restaurant.Restaurant;

public class Order {
    private String firstName;
    private int restaurant;
    private int pizza;
    private int pizzaDecorator;
    private KaspiAlaqan paymentType;
    private FacadePizza facadePizza;
    private Restaurant finalPizza;

    private Order(Builder builder){
        System.out.println("Your order has been created");
        this.firstName = builder.firstName;
        this.restaurant = builder.restaurant;
        this.pizzaDecorator = builder.pizzaDecorator;
        this.pizza = builder.pizza;
        this.paymentType = builder.paymentType;
        this.facadePizza = new FacadePizza(this.restaurant, this.pizza, this.pizzaDecorator);
        this.finalPizza = facadePizza.countPizza();
        System.out.println("Your order cost:" + this.facadePizza.getPrice());
    }

    public Restaurant getFinalPizza() {
        return finalPizza;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPaymentType(KaspiAlaqan paymentType) {
        this.paymentType = paymentType;
    }

    public void payOrder(){
        paymentType.pay();
    }


    public void cookPizza(){
        this.finalPizza.cookPizza();
        System.out.println(this.firstName + "your order has been created");
    }
    public static class Builder {
        private String firstName;
        private int restaurant;
        private int pizza;
        private int pizzaDecorator;
        private KaspiAlaqan paymentType;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder pizza(int pizza){
            this.pizza = pizza;
            return this;
        }

        public Builder restaurant(int restaurant){
            this.restaurant = restaurant;
            return this;
        }

        public Builder pizzaDecorator(int decorator){
            if (decorator != 0){
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
