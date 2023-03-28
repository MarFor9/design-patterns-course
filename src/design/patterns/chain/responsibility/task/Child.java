package design.patterns.chain.responsibility.task;

public abstract class Child {
    Child tallerChild;

    public abstract void processRequest(MotherRequest request);

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
