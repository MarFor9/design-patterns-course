package weather.forecast.observer.order;

import weather.forecast.observer.order.notification.EMail;
import weather.forecast.observer.order.notification.TextMessage;

import static weather.forecast.observer.order.OrderStatus.REGISTERED;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Warsaw", "100", 1, REGISTERED);
        TextMessage textMessage = new TextMessage();
        EMail mail = new EMail();

        order1.registerObserver(textMessage);
        order1.registerObserver(mail);

        System.out.println("----------------------------");
        System.out.println("First notifications ");
        order1.notifyObservers();

        System.out.println("----------------------------");
        System.out.println("Unregister TextMessage");
        order1.unregisterObserver(textMessage);

        System.out.println("----------------------------");
        System.out.println("Update order status");
        order1.updateOrder(OrderStatus.PREPARE);

    }
}
