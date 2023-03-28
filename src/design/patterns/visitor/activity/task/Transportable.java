package design.patterns.visitor.activity.task;

public interface Transportable {
    void accept(TransportVisitor visitor);
}
