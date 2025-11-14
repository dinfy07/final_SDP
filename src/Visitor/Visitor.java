package Visitor;
import Builder.Order;


public interface Visitor {

    void visit(Order customer);
}
