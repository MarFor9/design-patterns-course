package design.patterns.visitor.activity.task;

public class PriceTransportVisitor implements TransportVisitor {

    public static final String PRICE_PER_KILOMETER_FOR = "Price per kilometer for";

    @Override
    public void visit(Animal animal) {
        System.out.println(PRICE_PER_KILOMETER_FOR + " an animal: " + (animal.getWeight() * 0.2) + " PLN");
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println(PRICE_PER_KILOMETER_FOR + " a person: "
                + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price *= 3;
        }
        System.out.println(PRICE_PER_KILOMETER_FOR + " a shipment: "
                + price + " PLN");
    }
}
