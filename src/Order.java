import Decorator.PizzaDecorator;
import Payment.KaspiAlaqan;
import Pizza.Pizza;
import Restaurant.Restaurant;

public class Order {
    private String firstName;
    private Restaurant pizza;
    private KaspiAlaqan paymentType;

    private Order(Builder builder){
        System.out.println("Your order has been created");
        this.firstName = builder.firstName;
        this.pizza = builder.pizza;
        this.paymentType = builder.paymentType;
        System.out.println("Your order cost:" + this.pizza.getPrice());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPizza(Restaurant pizza) {
        this.pizza = pizza;
    }

    public void setPaymentType(KaspiAlaqan paymentType) {
        this.paymentType = paymentType;
    }

    public void payOrder(){
        paymentType.pay();
    }

    public static class Builder {
        private String firstName;
        private Restaurant pizza;
        private KaspiAlaqan paymentType;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder pizza(Restaurant pizza){
            this.pizza = pizza;
            return this;
        }

//        public Builder pizza(PizzaDecorator pizza){
//            this.pizza = pizza;
//            return this;
//        }

        public Builder paymentType(KaspiAlaqan paymentType){
            this.paymentType = paymentType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }


}
