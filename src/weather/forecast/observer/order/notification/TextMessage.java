package weather.forecast.observer.order.notification;

import weather.forecast.observer.order.Observer;
import weather.forecast.observer.order.Order;

public class TextMessage implements Observer {
    @Override
    public void updateOrder(Order order) {
        System.out.println("TextMessage - we send order to: " + order.getCity() + " with id: " + order.getId() + " and code: " + order.getCode() + " status : " + order.getStatus());
    }
}
