package design.patterns.observer.order;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private final int id;
    private final String city;
    private final String code;

    private OrderStatus status;

    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(String city, String code, int id, OrderStatus status) {
        this.city = city;
        this.code = code;
        this.id = id;
        this.status = status;
    }

    public void updateOrder(OrderStatus status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(observer -> observer.updateOrder(this));
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }

    public int getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
