package design.patterns.chain.responsibility.task;

public class Antek extends Child {
    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjela sloik z polkami");
        } else {
            throw new IllegalArgumentException("Unknown child");
        }
    }
}
