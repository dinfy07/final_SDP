package Visitor;

import Builder.Order;

public class CounterVisitor implements Visitor {
    int customerForItalian = 0;
    int customerForAmerican = 0;

    @Override
    public void visit(Order customer){
        System.out.println("Thank you for visiting our establishment. We are waiting for your feedback in 2GIS");
        if (customer.getRestaurant().toString().contains("ItalianRestaurant")){
            customerForItalian++;
        } else {
            customerForAmerican++;
        }
    }

//    @Override
//    public void visit(Restaurant restaurant){
//        System.out.println("Thank you for visiting our establishment. We are waiting for your feedback in 2GIS");
//        if re
//    }

}
