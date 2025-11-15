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

        KaspiAlaqan paymentWithKaspiAlaqan = new PaymentAdapter();

        System.out.println("Choose restaurant type: 1 - American, 2 - Italian");
        System.out.println("Choose pizza type: 1 - Pepperoni, 2 - Margherita");
        System.out.println("Choose pizza decorator type: 0 - none, 1 - Cheese, 2 - Pineapple");
        Order studentBeybitYeshimkul = new Order.Builder()
                .firstName("Beybit")
                .restaurant(1)
                .pizza(2)
                .pizzaDecorator(1)
                .paymentType(paymentWithKaspiAlaqan)
                .build();

        studentBeybitYeshimkul.payOrder();
        studentBeybitYeshimkul.cookPizza();
        November14.visit(studentBeybitYeshimkul);

    }
}