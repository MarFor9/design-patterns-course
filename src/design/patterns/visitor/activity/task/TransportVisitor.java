package design.patterns.visitor.activity.task;

public interface TransportVisitor {
    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);
}
