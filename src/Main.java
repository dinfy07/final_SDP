import Decorator.CheeseDecorator;
import Decorator.PizzaDecorator;
import Payment.KaspiAlaqan;
import Payment.PaymentAdapter;
import Pizza.MargheritaPizza;
import Pizza.PepperoniPizza;
import Restaurant.AmericanRestaurant;
import Restaurant.ItalianRestaurant;
import Restaurant.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant usPepperoni = new AmericanRestaurant(new PepperoniPizza());
        Restaurant usMargherita = new AmericanRestaurant(new MargheritaPizza());
        Restaurant itPepperoni  = new ItalianRestaurant(new PepperoniPizza());
        Restaurant itMargherita = new ItalianRestaurant(new MargheritaPizza());
        KaspiAlaqan paymentWithKaspiAlaqan = new PaymentAdapter();

//        PizzaDecorator usPepperoniWithCheese = new CheeseDecorator(usPepperoni);
        PizzaDecorator pizzaDecorator = new CheeseDecorator();
        System.out.println(pizzaDecorator.getPrice());

//        Order studentBeybitYeshimkul = new Order.Builder()
//                .firstName("Beybit")
//                .pizza(usPepperoni)
//                .paymentType(paymentWithKaspiAlaqan)
//                .build();
//
//        studentBeybitYeshimkul.payOrder();
    }
}