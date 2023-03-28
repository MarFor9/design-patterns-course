package design.patterns.chain.responsibility.task;

public class Ania extends Child {
    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjela sloik z polkami");
        }else {
            tallerChild.processRequest(request);
        }
    }
}
