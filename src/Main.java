import Builder.Order;
import Decorator.CheeseDecorator;
import Decorator.PizzaDecorator;
import Payment.KaspiAlaqan;
import Payment.PaymentAdapter;
import Pizza.MargheritaPizza;
import Pizza.PepperoniPizza;
import Pizza.Pizza;
import Restaurant.AmericanRestaurant;
import Restaurant.ItalianRestaurant;
import Restaurant.Restaurant;
import Visitor.Visitor;
import Visitor.CounterVisitor;

public class Main {
    public static void main(String[] args) {
//        14.11.2025
        Visitor November14 = new CounterVisitor();
        Restaurant americanRestaurant = new AmericanRestaurant();
        Restaurant italianRestaurant = new ItalianRestaurant();
        Pizza pepperoniPizza = new PepperoniPizza();
        Pizza margheritaPizza = new MargheritaPizza();
        PizzaDecorator cheeseDecorator = new CheeseDecorator();
        PizzaDecorator pineappleDecorator = new PizzaDecorator();

        KaspiAlaqan paymentWithKaspiAlaqan = new PaymentAdapter();


        Order studentBeybitYeshimkul = new Order.Builder()
                .firstName("Beybit")
                .restaurant(italianRestaurant)
                .pizza(pepperoniPizza)
                .pizzaDecorator(cheeseDecorator)
                .paymentType(paymentWithKaspiAlaqan)
                .build();

        studentBeybitYeshimkul.payOrder();
        studentBeybitYeshimkul.cookPizza();
        November14.visit(studentBeybitYeshimkul);

    }
}