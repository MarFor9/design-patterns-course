package design.patterns.observer.order.notification;


import design.patterns.observer.order.Order;
import design.patterns.observer.order.Observer;

public class EMail implements Observer {
    @Override
    public void updateOrder(Order order) {
        System.out.println("Email - we send order to: " + order.getCity() + " with id: " + order.getId() + " and code: " + order.getCode() + " status : " + order.getStatus());
    }
}
